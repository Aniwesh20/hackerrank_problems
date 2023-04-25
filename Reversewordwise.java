/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Reversewordwise {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(reverse(str));
    }
    
    public static String reverse(String s){
         char[] c = s.toCharArray();
        int i = 0, j = 0;
        for (;j<c.length;j++) {
            if (c[j] == ' ') {
                reverseWord(c, i, j-1);
                i = j+1;
            } 
        }
        reverseWord(c, i, j-1);
        return new String(c);
    }
    
    private static void reverseWord(char[] c, int i, int j) {
        while (i < j) {
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }
}