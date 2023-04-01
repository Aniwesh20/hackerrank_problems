
import java.io.*;
import java.util.*;

public class JumpGames5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(jump(arr));
        
        }
        
          public static boolean jump(int[] arr){
        int cur= 0;
        for(int i=0;i<arr.length;i++){
            if (i>cur) return false;
            cur = Math.max(cur,i+arr[i]);
        }
        return true;
    }
        
  
    }