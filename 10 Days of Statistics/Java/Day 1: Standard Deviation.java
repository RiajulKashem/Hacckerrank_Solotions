import java.util.*;
import java.math.*;
/*
*   Autoure : Riajul Kashem
*
*   */
public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i=0; i<n; i++){
            int temp = scan.nextInt();
            nums.add(temp);
        }
        double mean = 0;
        for (int i: nums)
            mean += (double) i;
        mean = mean / n;
        double sum = 0;
        for (int i: nums)
            sum += Math.pow(((double) i - mean), 2);
        double result = Math.sqrt(sum/n);
        System.out.printf("%.1f\n",result);
    }
}
