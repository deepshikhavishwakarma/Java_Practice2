package CodePractice2.Project.Vechile_Rental_System;

public class Bike extends Vehicle{
    private boolean hasCarrier;

    public Bike(int licensePlate, String model, double rentalPricePerDay, boolean isAvailable, boolean hasCarrier) {
        super(licensePlate, model, rentalPricePerDay, isAvailable);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Having Carrier "+hasCarrier);
    }
    @Override
    public double calculateRentalCost(int days) {

        return super.calculateRentalCost(days)*800;
    }
}
