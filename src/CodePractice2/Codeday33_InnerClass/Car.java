package CodePractice2.Codeday33_InnerClass;

public class Car {

    static class PetrolCar{
        String brand;
        String model;
        float fuelCapacity;
        double currentFuelLevel;

        public PetrolCar(String brand, String model, float fuelCapacity, double currentFuelLevel) {
            this.brand = brand;
            this.model = model;
            this.fuelCapacity = fuelCapacity;//10 ltr
            this.currentFuelLevel = currentFuelLevel;//10%
        }
        public double refuel(double amount){

            double remainingFuel = fuelCapacity-currentFuelLevel;
            System.out.println("remainingFuel  "+remainingFuel);
            if(amount < 0){
                System.out.println("Amount should not be Negative or Zero");
            }else{
                amount /= 118;//500/110 = 4.5
                System.out.println( "Amount "+amount);
                System.out.println("curr fuel "+currentFuelLevel);
                currentFuelLevel +=amount;
            }

         return currentFuelLevel;
        }
        public double drive(double distance){
            if(distance<=0){
                System.out.println("Distance should be more then 0");
            }else {
                double remainingFuel = distance / 10;
                currentFuelLevel -= remainingFuel;
            }
          return currentFuelLevel;
        }
        public void displayDetails(){
            System.out.println("Brand               "+brand);
            System.out.println("Model               "+model);
            System.out.println("Fuel Capacity       "+fuelCapacity);
            System.out.println("Current fuel level  "+currentFuelLevel);

        }

    }

    class ElectricCar{
        String brand;
        String model;
        double batteryCapacity;  //100
        double currentBatteryLevel; //10

        public ElectricCar(String brand, String model, double batteryCapacity, double currentBatteryLevel) {
            this.brand = brand;
            this.model = model;
            this.batteryCapacity = batteryCapacity;
            this.currentBatteryLevel = currentBatteryLevel;
        }
        public double charge(double amount){//90
            //System.out.println("curr" +currentBatteryLevel);//25
            //double remainingBattery = 100-currentBatteryLevel;
            //System.out.println(remainingBattery);
           if(currentBatteryLevel == 100){
               System.out.println("Battery is full");
           }else if(amount <=0){
               System.out.println("amount should be positive.");
           }else {
               currentBatteryLevel = currentBatteryLevel+(amount/20);//assume 5kwh = 20rs

               //System.out.println("acc"+currentBatteryLevel);
               }

            return currentBatteryLevel;
        }
        public double drive(double distance){
            if(distance<=0){
                System.out.println("Distance should be more then 0");
            }else {
                double remainingBattery = (distance *5)/ 100;
                currentBatteryLevel -= remainingBattery;
            }
            return currentBatteryLevel;

        }
        public void displayDetails(){
            System.out.println("Brand                  "+brand);
            System.out.println("Model                  "+model);
            System.out.println("battery Capacity       "+batteryCapacity);
            System.out.println("Current Battery level  "+currentBatteryLevel);
        }

    }

    public static void main(String[] args) {
        Car.PetrolCar pc = new Car.PetrolCar("Audi","TT RS",10,10);
        pc.drive(48);
        pc.displayDetails();
        System.out.println();
        pc.refuel(500);
        pc.displayDetails();
        System.out.println();

        Car.ElectricCar ec = new Car().new ElectricCar("TATA","Curvv EV",100,40);
        ec.drive(300);
        ec.displayDetails();
        System.out.println();
        ec.charge(60);
        ec.displayDetails();
    }
}
