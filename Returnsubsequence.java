/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Returnsubsequence {

    public static void main(String[] args) {
   
    Scanner scn=new Scanner(System.in);
    String str=scn.nextLine();
    ArrayList<String>ans= gss(str);

              Collections.reverse(ans);
        System.out.println(ans);
    
    
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            
            bres.add("");
            return bres;
        }
        
        char ch=str.charAt(0); 
        String ros=str.substring(1); 
        ArrayList<String>rres=gss(ros);
        
        ArrayList<String>myRes=new ArrayList<>();
        
        for( String rstr:rres){
            myRes.add(""+rstr);
            
        }
         for( String rstr:rres){
            
            myRes.add(ch+rstr);
        }
        
       return myRes; 
        
    }

        
       
    
}