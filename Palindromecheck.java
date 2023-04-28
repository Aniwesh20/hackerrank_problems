/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Palindromecheck {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        String str= scn.nextLine();
        
        HashSet<Character>ht=new HashSet<>();
        
        for(int i=0;i<str.length();i++){
           char ch= str.charAt(i);
            ht.add(ch);
        }
        
        
        if(ht.size()==26){
            System.out.println("true");
            return;
        }
        
        else{
            System.out.println("false");
        }
        
        
    }
}
