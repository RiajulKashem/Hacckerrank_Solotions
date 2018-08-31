import java.util.*;
import java.math.*;

public class Solotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        int left = 0;
        int right = 0;
        int[] array = new int[tc];
        for (int i = 0; i < tc; i++) {
            for (int j = 0; j < tc; j++){
                array[j] = scan.nextInt();
            }
            left += array[i];
            right += array[tc-(i+1)];
        }
        System.out.println(Math.abs(left-right));
    }
}
