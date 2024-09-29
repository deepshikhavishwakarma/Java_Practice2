package CodePractice2.Codeday35_WrapperClass;

class Temperature {
    private double celsius;
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }
    public Integer convertToFahrenheit(){
        Integer fahrenheit = (int)((celsius * 9/5) + 32);
        return fahrenheit;
    }


}
public class TemperatureTest{
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        t1.setCelsius(25);
        System.out.println("The Fahrenheit temperature  "+t1.convertToFahrenheit());
        t1.setCelsius(0);
        System.out.println("The Fahrenheit temperature  "+t1.convertToFahrenheit());

    }

}
