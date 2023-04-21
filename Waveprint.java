/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Waveprint {
public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 
 
    int r=scn.nextInt();
    int  c=scn.nextInt();
    int m[][]=new int[r][c];
    
    
    input(m);
    
    sow(m);
    
    
 }

public static void input(int a[][]){
    
    
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            a[i][j]=scn.nextInt();
        }
    }
}


public static void sow(int m[][]){
    
    
    
    int row=m.length;
    int col=m[0].length;
    
    
    for(int j=0;j<col;j++){
        
        if(j%2==0){
            //even means downwards.
            
            
            for(int i=0;i<row;i++){
                System.out.print(m[i][j]+" ");
            }
        
        
        }
        
        else{
            
            for(int i=row-1;i>=0;i--){
                System.out.print(m[i][j]+" ");
            }
        }
    }
    }
}