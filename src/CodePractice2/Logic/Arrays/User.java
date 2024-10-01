package CodePractice2.Logic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Student {

    String name;
    int id;
    public Student(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]\n";
    }


}

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student e[]=new Student[5];
        String name;int id;
        for(int i=0;i<5;i++){
            System.out.println("Enter Student name: ");
            name=sc.next();
            System.out.println("Enter Student Id");
            id = sc.nextInt();

            e[i] = new Student(name,id);

        }

//        for(Student i:e){
//            System.out.println(i);
//        }

        //2nd method for print array
        System.out.println(Arrays.toString(e));


        //3rd way of printing array
        int i=0;
        while(i<e.length){
            System.out.println(e[i]);
            i++;
        }

    }
}
