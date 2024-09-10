package CodePractice2.Codeday31_InnerClass;
import java.util.*;
public class Zoo {//Outer class
    class Lion{
       int nooOfLion;

        public Lion(int nooOfLion) {
            this.nooOfLion = nooOfLion;
        }
        public void displayMessage(){
            System.out.println("Number of Lions are "+nooOfLion);
        }

    }
    class Tiger{
        int noOfTiger;

        public Tiger(int noOfTiger) {
            this.noOfTiger = noOfTiger;
        }
        public void displayMessage(){
            System.out.println("Number of Tigers are "+noOfTiger);
        }

    }
    class Monkey{
        int noOfMonkey;

        public Monkey(int noOfMonkey) {
            this.noOfMonkey = noOfMonkey;
        }
        public void displayMessage(){
            System.out.println("Number of Monkeys are "+noOfMonkey);
        }

    }
    class OtherAnimal{
        int noOfOther;

        public OtherAnimal(int noOfOther) {
            this.noOfOther = noOfOther;
        }
        public void displayMessage(){
            System.out.println("Number of Other Animals are "+noOfOther);
        }
    }

    public void displayAnimals(int nooOfLion,int noOfTiger,int noOfMonkey,int noOfOther){
        Lion l1 = new Lion(nooOfLion);
        l1.displayMessage();
        Tiger t1 = new Tiger(noOfTiger);
        t1.displayMessage();
        Monkey m1 = new Monkey(noOfMonkey);
        m1.displayMessage();
        OtherAnimal o1 = new OtherAnimal(noOfOther);
        o1.displayMessage();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Lion in Zoo");
        int l = sc.nextInt();
        System.out.println("Enter No of Tiger in Zoo");
        int t = sc.nextInt();
        System.out.println("Enter No of Monkey in Zoo");
        int m = sc.nextInt();
        System.out.println("Enter No of Other Animals in Zoo");
        int o = sc.nextInt();
        Zoo z1 = new Zoo();
        z1.displayAnimals(l,t,m,o);
    }

}
