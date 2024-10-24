package CodePractice2.Project.Vechile_Rental_System;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(int licensePlate, String model, double rentalPricePerDay, boolean isAvailable, double loadCapacity) {
        super(licensePlate, model, rentalPricePerDay, isAvailable);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity "+loadCapacity);
    }
    @Override
    public double calculateRentalCost(int days) {

        return super.calculateRentalCost(days)*1500;
    }
}
