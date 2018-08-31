import java.util.*;
import java.math.*;

public class Solotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger sum = new BigInteger("0");
        for (int i = scan.nextInt(); i > 0; i--)
            sum = sum.add(scan.nextBigInteger());
        System.out.println(sum);
    }
}
