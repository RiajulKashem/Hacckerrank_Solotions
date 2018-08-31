import java.util.*;
class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array_1 = new int[size];
        int[] array_2 = new int[size];

        double array_2_sum = 0.0;
        double array_1_sum = 0.0;

        for (int i = 0; i < size; i++) {
            array_1[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
            array_2[i] = scan.nextInt();
            array_2_sum += array_2[i];
        }

        for (int i = 0; i < size; i++) {
            array_1_sum += array_2[i] * array_1[i];
        }
        System.out.printf("%.1f",array_1_sum/array_2_sum);

    }
}
