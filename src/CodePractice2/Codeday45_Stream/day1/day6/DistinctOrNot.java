package CodePractice2.Codeday45_Stream.day1.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctOrNot {
    public static boolean checkDistinct(int[] arr1){
        int[] arr2 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr2));
        if(arr1.length==arr2.length){
            return false;
        }
       return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        boolean res = DistinctOrNot.checkDistinct(arr1);
        System.out.println(res);

        //----------------Prog 2 --------------------------

        System.out.println(" Greater than 50 . ");

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> l1 =list.stream().map(x->x*x*x).filter(x->x>50).collect(Collectors.toList());
        System.out.println(l1);

        //----------------------Prog 5 ---------------------
        List<String> l3 = List.of("A","B","C");
        List<String> l4 = List.of("D","E","F");
        List<String> l5 = List.of("G","H","I");
        List<List<String>> list3 = List.of(l3,l4,l5);
        System.out.println("Individuals List : "+list3);
        System.out.print("Merged List : ");
        list3.stream().flatMap(l->l.stream()).forEach(System.out:: print);

    }
}
