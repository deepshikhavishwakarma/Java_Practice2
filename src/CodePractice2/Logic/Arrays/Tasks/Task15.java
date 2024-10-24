package CodePractice2.Logic.Arrays.Tasks;

public class Task15 {
    public static int findProfit(int[] arr){


        int buy = arr[0] ;
        int profit = 0;                       //      7,1,5,3,6,4

        for(int i=0;  i<arr.length;  i++){
//            System.out.println("Index and element  "+i+"   "+arr[i]);
           if(arr[i] <= buy){
               buy = arr[i];
//               System.out.println("Buy  "+buy);
           }else{
             int curr_Profit = arr[i]- buy;

//               System.out.println("current profit "+curr_Profit);
             profit = Math.max(profit,curr_Profit);
//               System.out.println("Profit  "+profit);
           }


        }
        System.out.println(buy);

        return profit;
    }
    public static void main(String[] args) {

        int[] arr = {44,12,56,89,56,4};
        int profit = findProfit(arr);
        System.out.println("Profit is  "+profit);

    }

}

