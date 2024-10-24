package CodePractice2.Project.Vechile_Rental_System;

 class Car extends Vehicle{
    private int numberOfSeats;
    private String fuelType;

     public Car(int licensePlate, String model, double rentalPricePerDay, boolean isAvailable, int numberOfSeats, String fuelType) {
         super(licensePlate, model, rentalPricePerDay, isAvailable);
         this.numberOfSeats = numberOfSeats;
         this.fuelType = fuelType;
     }

     @Override
     public void displayDetails() {
         super.displayDetails();
         System.out.println("Number of Seats"+numberOfSeats);
         System.out.println("Fuel Type"+fuelType);

     }

     @Override
     public double calculateRentalCost(int days) {

         return super.calculateRentalCost(days)*1000;
     }
 }
