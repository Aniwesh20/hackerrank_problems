/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Checkpalindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
    
    int left=0;
    int right=str.length()-1;
    
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println(false);
                return;
            }
           
            
        }
         System.out.println(true);
        
        
       
    }
}