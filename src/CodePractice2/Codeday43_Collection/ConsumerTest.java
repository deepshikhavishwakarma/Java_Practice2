package CodePractice2.Codeday43_Collection;

import java.util.ArrayList;
import java.util.function.Consumer;
//How forEach(Consumer<T> cons) is working internally ?
public class ConsumerTest {
    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Mango");
//        fruits.add("Apple");
//        fruits.add("Litchi");
//        fruits.add("Coconut");
//        fruits.add("Dates");
//        fruits.add("Orange");
//        fruits.add("Pine apple");
//        //Lambda expression
//        Consumer<String> con=(str)-> System.out.println(str);

//        //Anonymous inner class
//		Consumer<String> con = new Consumer<String>()
//		{
//			@Override
//			public void accept(String t)
//			{
//				System.out.println(t);
//			}
//		};

        //using for each method
//        fruits.forEach(fruit-> System.out.println(fruit));
//        fruits.forEach(con);
        //method reference
//       fruits.forEach(System.out::println);
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(12);
       arr.add(22);
       arr.add(32);
       arr.add(42);
       arr.add(52);
       arr.add(62);
       int sum1 =0;
       int div = arr.size();
//       Consumer
        for (int n :arr) {
             sum1+=n;
        }
//        Consumer<Integer> con=(sum)-> {sum = sum1;System.out.println(sum/div);
        Consumer<Integer> con=(sum)-> System.out.println(sum/div);
//        arr.forEach("The Output is : "+Integer.parseInt(sum/div));
    }
}
