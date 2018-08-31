import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());
        while (n-- > 0){
            String s = br.readLine();
            print(s);
        }
    }

    private static void print(String s){
        StringBuffer even = new StringBuffer();
        StringBuffer odd = new StringBuffer();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (i % 2 == 0) even.append(ch);
            else odd.append(ch);
        }
        System.out.println(even+" "+odd);
    }
}
