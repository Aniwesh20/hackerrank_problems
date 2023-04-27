/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Solution {

    public static void Isomorphicstring(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        System.out.println(isIsomorphic(str1, str2));
    }
    
    public static boolean isIsomorphic(String s, String t) {
         if(s.length()!=t.length()){
            return false;
        }

  HashMap<Character,Character> hmap1=new HashMap<>();
 HashMap<Character,Boolean> hmap2=new HashMap<>();

for(int i=0;i<s.length();i++){
    char ch1= s.charAt(i);
    char ch2=t.charAt(i);

    if(hmap1.containsKey(ch1)==true){
        if(hmap1.get(ch1)!=ch2){
            return false;
        }
    }
    else{
        if(hmap2.containsKey(ch2)==true){
            return false;
        }
        else{
            hmap1.put(ch1,ch2);
            hmap2.put(ch2,true);
        }
    }
}
return true;

    }
}