import java.util.*;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int max = 0;
        int counter = 1;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int item = scan.nextInt();
            if (item > max){
                max = item;
                counter = 1;
            }
            else if (max == item) counter++;

        }

        System.out.println(counter);
    }
}
