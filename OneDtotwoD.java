/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

 import java.io.*;
import java.util.*;

public class OneDtotwoD {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0;i<arr.length;i++){
                arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int n = sc.nextInt();
        

    int[][] matrix = new int[m][n];

    for (int i = 0; i < arr.length; ++i)
      matrix[i / n][i % n] = arr[i];

    for (int i = 0; i < matrix.length; i++) { 
         for (int j = 0; j < matrix[i].length; j++) { 
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println(); 
      }
    }
}
  