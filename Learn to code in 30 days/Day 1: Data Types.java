import java.util.*;

public class Solution{
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int intValue = scan.nextInt();
        double doubleValue = scan.nextDouble();
        scan.nextLine();
        String stringValue = scan.nextLine();

        System.out.println(i+intValue);
        System.out.println(d+doubleValue);
        System.out.println(s+stringValue);
    }
}
