package CodePractice2.Codeday43_Collection.Map.day2.CustomerOrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class OrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        OrderManager om = new OrderManager();
        while(true)
        {
            System.out.println("Select an Option:\n1 . Add\n2 . Get Order\n3 . List\n4 . find\n5 . Remove");
            int option = Integer.parseInt(sc.nextLine());
            switch(option){
                case 1:
                    System.out.println("How many Order you want to add");
                    int num  = Integer.parseInt(sc.nextLine());
                    for(int i = 0;i<num;i++){
                        System.out.println("Order "+i+"-> Enter order Id: ");
                        String id =sc.nextLine();
                        System.out.println("Order "+i+"-> Enter Customer name: ");
                        String name =sc.nextLine();
                        System.out.println("Order "+i+"-> Enter Selected Item: ");
                        System.out.println("How many items you want to select");
                        int itemscount =Integer.parseInt(sc.nextLine());
                        List<String> item=new ArrayList<String>();
                        for(int j=0;j<itemscount;j++){
                            System.out.println("Enter Product here");
                            item.add(sc.nextLine());
                        }

                        System.out.println("Order "+i+"-> Enter total amount: ");
                        double amt = Double.parseDouble(sc.nextLine());
                        Order order = new Order(id,name,item,amt,"pending");

                        om.addOrder(order);


                    }
                        break;
                case 2:
                    System.out.println("Get Order by ID:\nEnter Order id : ");
                    String oID = sc.nextLine();
                    om.getOrder(oID);

                    break;
                case 3:
                    System.out.println("List Item here");
                    System.out.println(om.listAllOrders());
                    break;
                 case 4:
                    System.out.println("Find Item here");
                     System.out.println("Enter Order Id");
                     String id =sc.nextLine();
                    om.findOrdersByStatus("Pending");



//                    System.out.println(om.listAllOrders());
                    break;

                    case 5:
                    System.out.println("Remove Item from list");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }

    }
}
