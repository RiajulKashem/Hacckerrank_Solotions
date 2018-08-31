import java.util.*;

public class Solotion{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int input, sum = 0;
        for (int i = 0;i < arraySize; i++) {
            input = scan.nextInt();
            sum += input;
        }
        System.out.println(sum);

    }
}
