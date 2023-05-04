/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Removex2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = 'x';
        
        System.out.println(removeX(str, ch));
    }
    
    public static String removeX(String str, char ch){
        if (str.length() == 0){
        return "";
        }
        if (str.charAt(0) == ch){
         return removeX(str.substring(1), ch);
        }
        return str.charAt(0) + removeX(str.substring(1), ch);
        
        
    }
}