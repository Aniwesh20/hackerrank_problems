/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Spiralprint {
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();
  
        if (matrix.length == 0)
            return ans;
  
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
  
        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];
  
            if (0 <= cr && cr < m && 0 <= cc && cc < n
                && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
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
        List<Integer> arrli = new ArrayList<Integer>();
        arrli=spiralOrder(arr);
        for (int i = 0; i < arrli.size(); i++){
            System.out.print(arrli.get(i) + " ");
        }
        
        
        
    }
}
