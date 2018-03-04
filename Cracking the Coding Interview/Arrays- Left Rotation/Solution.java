import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    void rotate(int[] a,int k){ 
        for(int i = 0; i < k; i++){
             leftRotation(a, a.length);
        }     
    }

    void leftRotation(int[] a,int n){
        int i;
        int temp = a[0];
        for( i = 0; i < n-1; i++){
            a[i] = a[i+1];
            
        }   
        a[i] = temp; 
 
    }
    public static String print(int[] a){
        String s = "";
        for(int i= 0; i< a.length; i++){
             System.out.print(a[i]+" ");
        }
        return s;
        
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n]; 
        Solution arr = new Solution();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt(); 
        }
        arr.rotate(a, k);
        arr.print(a);
    }
}

