import java.util.*;
import java.math.*;
/*
*   Autoure : Riajul Kashem
*
*   */
public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double milCost = scan.nextDouble();
        double tipParcent = scan.nextDouble();
        double taxParcent = scan.nextDouble();
        double r = (100.0 + tipParcent + taxParcent) / 100.0;
        System.out.println("The total meal cost is "+Math.round(milCost * r)+" dollars.");

    }
}
