/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Powernumber3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // System.out.println((int)Math.pow(n,m));
        System.out.println((int)myPow(n,m));
    }
    public static double myPow(double x, int n) {
       if(n < 0) {
            n = -n;
            x = 1/x;
        }
        return pow(x, n);
    }
    
    private static double pow(double x, int n) {
        if(n == 0) return 1.0;
        
        if(n%2 == 0) {
            return pow(x*x, n/2);
        }else {
            return x * pow(x*x, n/2);
        }
    }
}