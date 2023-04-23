/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Solution {

    public static void Searchinmatrix(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == target){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}