/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Dutchalgo {

    public static void main(String[] args) {
    
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<a.length;i++){
        a[i]=scn.nextInt();
        }
        
        
        Arrays.sort(a);
        
        for(int ele:a){
        System.out.print(ele+" ");
        }
        
        
    }
}
