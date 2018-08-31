import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int nm = scan.nextInt();
            nums.add(nm);
        }
        Collections.sort(nums);

        List<Integer> l = new ArrayList<>();
        List<Integer> u = new ArrayList<>();

        for (int i = 0; i < n/2; i++)
            l.add(nums.get(i));

        if(n%2 == 0){
            for (int i = n/2; i < n; i++)
                u.add(nums.get(i));
        }
        else{
            for (int i = n/2+1; i < n; i++)
                u.add(nums.get(i));
        }

        System.out.printf("%d\n%d\n%d",median(l),median(nums), median(u));
    }

    private static int median(List<Integer> a){
        int l = a.size();
        int m = a.get(l/2);
        if (l%2 == 0){
            m = m + a.get((l/2)-1);
            m = m / 2;
        }
        return m;
    }

}
