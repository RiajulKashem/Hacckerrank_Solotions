import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();

        int counter = 0;
        while (m-- > 0){
            int v = scan.nextInt();
            if (s <= a+v && a+v <= t) counter++;
        }
        System.out.println(counter);
        counter = 0;
        while (n-- > 0){
            int v = scan.nextInt();
            if (s <= b+v && b+v <= t) counter++;
        }
        System.out.println(counter);
    }
}
