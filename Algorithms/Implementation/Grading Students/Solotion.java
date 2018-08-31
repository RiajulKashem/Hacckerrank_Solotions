import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.valueOf(br.readLine());
            while (n-- > 0){
                int grade = Integer.valueOf(br.readLine());
                if (grade >= 38 && grade % 5 >= 3) System.out.println(grade + (5 - (grade % 5)));
                else System.out.println(grade);
            }
     }
}
