/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Recursivelinearsearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
      boolean ans=  linearSearch(arr,0,arr.length-1,target);
        

        
            System.out.println(ans);
        
    }
    
    
 public static boolean linearSearch(int input_array[], int l, int r, int target) {
      if (r < l)
         return false;
      if (input_array[l] == target)
         return true;
      if (input_array[r] == target)
         return true;
      return linearSearch(input_array, l+1, r-1, target);
   }
}