import java.util.*;

public class Solotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];

        for (int i = 0; i < 3; i++) {
            alice[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            bob[i] = scan.nextInt();
        }
        int alicPoint = 0;
        int bobPoint = 0;
        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob[i]) alicPoint += 1;
            if (alice[i] < bob[i]) bobPoint += 1;
        }
        System.out.println(alicPoint+" "+bobPoint);

    }
}
