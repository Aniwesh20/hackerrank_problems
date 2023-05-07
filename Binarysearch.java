/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Binarysearch {
    public static int binary(int [] arr,int l,int h,int t){
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                h=mid-1;
            }
            else {
                l=mid+1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int t= scn.nextInt();
        int l=0,h=n-1;
        System.out.println(binary(arr,l,h,t));
        
    }
}