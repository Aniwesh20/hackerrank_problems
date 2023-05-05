/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Towerofhanoi {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String a="a";
        String b="b";
        String c="c";
        
        toh(n,a,c,b);
    }
    
    public static void toh(int n,String n1, String n2,String n3){
        if(n==0){
            return;
        }
        
        toh(n-1,n1,n3,n2);
        System.out.println(n1 +" "+n2);
        toh(n-1,n3,n2,n1);
    }
}
