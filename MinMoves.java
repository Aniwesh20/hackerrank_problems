/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class MinMoves {
    public static int findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
  
        // check for even case
        if (n % 2 != 0)
            return (int)a[n / 2];
  
        return (int)(a[(n - 1) / 2] + a[n / 2]) / 2;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i<n;i++){
            a[i]= sc.nextInt();
        }
        int count=0,median; 
        
        median = findMedian(a,n);
        
        for(int i = 0 ; i<n;i++){
            if (a[i] > median)
                count += a[i]-median;
            else
                count += median-a[i];
        }
        System.out.println(count);
    
    }
}