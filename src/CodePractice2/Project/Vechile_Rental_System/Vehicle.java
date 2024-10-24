package CodePractice2.Project.Vechile_Rental_System;

public class Vehicle {
    private int licensePlate;
    private String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Vehicle(int licensePlate, String model, double rentalPricePerDay, boolean isAvailable) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = isAvailable;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayDetails(){
        System.out.println("Licence Plate "+licensePlate);
        System.out.println("Model "+model);
        System.out.println("Rental Price "+rentalPricePerDay);
        System.out.println("Availability "+isAvailable);
    }
    public double calculateRentalCost(int days){
        rentalPricePerDay = days*1;
        return rentalPricePerDay;
    }

   public void  rentVehicle(Vehicle v)
    {
        System.out.println("Vehcle "+v.getModel()+" is for rent");
    }

}
