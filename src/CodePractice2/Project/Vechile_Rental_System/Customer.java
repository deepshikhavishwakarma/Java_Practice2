package CodePractice2.Project.Vechile_Rental_System;

public class Customer extends User{

    public Customer(int userId, String name, String email, Vehicle vehicle) {
        super(userId, name, email, vehicle);
    }

    public void viewAvailableVehicles(){
        System.out.println("Vechile Avalibility is "+vehicle.isAvailable());
    }
    void rentVehicle(String vehicleType){

    }
    void returnVehicle(String licensePlate){

    }

}
