package CodePractice2.Codeday34_Polymorphism.Vehicle;
class Vehicle{
    private int speed;

    public Vehicle() {
        this.speed = 30;
    }

    public void speedUp(){
        System.out.println("Vechile speed should be : "+getSpeed());
    }

    public int getSpeed() {
        return speed;
    }
}
class Car extends Vehicle{

    @Override
    public void speedUp(){
        System.out.println("Car MAx speed should be  :"+(getSpeed()+20));
    }
}
class Motorcycle extends Vehicle{
    @Override
    public void speedUp(){
        System.out.println("Motor Cycle MAx speed should be :"+(getSpeed()+30));
    }
}
public class MainClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speedUp();
        Motorcycle m1 = new Motorcycle();
        m1.speedUp();
    }
}
