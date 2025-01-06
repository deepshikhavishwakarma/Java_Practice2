/*
* Given an array 'v' of 'n' numbers.



Your task is to find and return the highest and lowest frequency elements.



If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.



Example:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]

Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6
1 2 3 1 1 4
Sample Output 1 :
1 2
Sample Explanation 1:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]

Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
Sample Input 2 :
6
10 10 10 3 3 3
Sample Output 2 :
3 3
Sample Explanation 2:
Input: ‘n' = 6, 'v' = [10, 10, 10, 3, 3, 3]

Output: 3 3

Explanation: Since the frequency of '3' and '10' is 3. Therefore, the element with the maximum and minimum frequency is '3'.
Expected Time Complexity :
The expected time complexity is O(n), where n is the size of the array.
Expected Space Complexity :
The expected time complexity is O(n), where n is the size of the array.
Constraints :
2 <=  n <= 10^4
1 <= v[i] <= 10^9
There are at least two distinct elements in the array.
* */

package CodePractice2.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayProg27_Nov {
    public static int[] getFrequencies(int []v) {
        return v;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,5,5,2,3,4,3,2,4,3,4,5,3,1};
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> collect1 = collect.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).collect(Collectors.toList());

        int [] arr1={collect1.get(collect1.size()-1),collect1.get(0)};
        System.out.println(Arrays.toString(arr1));
    }
}
