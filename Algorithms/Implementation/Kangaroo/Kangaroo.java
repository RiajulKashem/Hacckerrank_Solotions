import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();

        if (v1 > v2 && (x2-x1)%(v1-v2) == 0)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
