/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Rotatearray2d {
public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           
    int n=scn.nextInt();
    int m=scn.nextInt();
    
    int a[][]=new int[n][m];
    
    input(a);
    
    rotate90Degree(a);
    // display(a);
    }
    
    
    public static void input(int a[][]){
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=scn.nextInt();
            }
        }
    }
    
    public static void rotate90Degree(int a[][]){
    
    //transpose:-
    
    for(int i=0;i<a.length;i++){
        for(int j=0;j<i;j++){
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;
        }
    }
    
    
    //reverse column row by row:-
    
    
    for(int i=0;i<a.length;i++){
        int li=0;
        int ri=a[0].length-1;
        
        while(li<=ri){
            int temp=a[i][li];
            a[i][li]=a[i][ri];
            a[i][ri]=temp;
            
            li++;
            ri--;
        }
    }
    display(a);
    }
    
     public static void display(int[][] arr){
      for(int i = 0; i < arr.length; i++){
          for(int j = 0; j < arr[0].length; j++){
              System.out.print(arr[i][j] + " ");
          }
          // System.out.println();
      }
        
        
        
    }
}