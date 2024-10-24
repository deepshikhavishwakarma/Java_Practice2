package CodePractice2.Project.Vechile_Rental_System;

 class Admin extends User{
     public Admin(int userId, String name, String email, Vehicle vehicle) {
         super(userId, name, email, vehicle);
     }

     public void viewAvailableVehicles(){
         System.out.println("Vechile Avalibility is "+vehicle.isAvailable());
    }
//
}
