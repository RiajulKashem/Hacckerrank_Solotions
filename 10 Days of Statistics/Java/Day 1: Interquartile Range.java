import java.util.*;
/*
*   Autoure : Riajul Kashem
*
*   */
public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] elements = new int[n];
        int[] frequency = new int[n];

        /* Input and Save all Data */
        for (int i = 0; i < n; i++)
        {
            elements[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            frequency[i] = scan.nextInt();
        }

        /* Create a data set and sort it */
        List<Integer> data = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int temp = frequency[i];
            for (int j = 0; j < temp; j++){
                data.add(elements[i]);
            }
        }
        Collections.sort(data);

        List<Integer> l = new ArrayList<>();
        List<Integer> u = new ArrayList<>();
        n = data.size();
        for (int i = 0; i < n/2; i++)
            l.add(data.get(i));

        if(n%2 == 0){
            for (int i = n/2; i < n; i++)
                u.add(data.get(i));
        }
        else{
            for (int i = n/2+1; i < n; i++)
                u.add(data.get(i));
        }

        double value = median(u) - median(l);
        System.out.printf("%.1f\n",value);
    }

    private static double median(List<Integer> a){
        double l = (double) a.size();
        double m = (double) a.get((int)l/2);
        if (l%2 == 0){
            m = m + a.get(((int)l/2)-1);
            m = m / 2;
        }
        return m;
    }
}
