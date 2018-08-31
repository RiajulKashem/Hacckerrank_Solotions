import java.util.*;
public class Solution {

    // Complete the staircase function below.
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ch = "#";
        for (int i = n; i > 0; i--){
            System.out.printf("%"+n+"s",ch);
            ch += "#";
            System.out.print("\n");
        }

    }
}
