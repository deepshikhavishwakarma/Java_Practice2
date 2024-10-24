package CodePractice2.Project.Vechile_Rental_System;

import java.util.ArrayList;
import java.util.List;

public class VehicleFactory {
    public static void main(String[] args) {
//        List<String> l1 = new ArrayList<>();
//        l1.add()
        Car car = new Car(1234,"z120",1000,true,4,"Petrol");
        Truck truck = new Truck(2345,"Z34rt",1500,true,20);
        Bike bike = new Bike(3456,"z15",800,true,true);
        User user = new Admin(1234,"Deep","abc@gmail.com",car);

    }
}
