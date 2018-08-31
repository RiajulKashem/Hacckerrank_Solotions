import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if ((N%2 == 0 && N >= 2 && N <= 5) || (N%2 == 0 && N > 20) ) System.out.printf("Not Weird\n");
        else if ((N%2 == 0 && N >=6 && N <= 20) || N%2 != 0 )System.out.printf("Weird\n");
    }
}
