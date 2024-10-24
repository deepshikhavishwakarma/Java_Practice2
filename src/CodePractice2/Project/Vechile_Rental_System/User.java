package CodePractice2.Project.Vechile_Rental_System;

abstract class User {
    int userId;
    String name;
    String email;
    Vehicle vehicle;

    public User(int userId, String name, String email, Vehicle vehicle) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.vehicle = vehicle;
    }

    abstract void viewAvailableVehicles();
     void rentVehicle(String vehicleType){

     }
     void returnVehicle(String licensePlate){

     }
}
