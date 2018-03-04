import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] alphabet = new int[26]; 
        
		compareWord(alphabet, first, true);
        compareWord(alphabet, second, false);
        
		int res = 0;
		for( int i : alphabet ){
			res += Math.abs(i);
		}
		return res;
    }
    
    static void compareWord(int[] alphabet, String word, boolean operation){
        char[] w = word.toCharArray();
        
        if(operation == true){
            for(int i = 0; i < w.length; i++){
			alphabet[w[i]-'a']++;
		    }
        } else {
            for(int i = 0; i < w.length; i++){
			alphabet[w[i]-'a']--;
		    }
        }
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
