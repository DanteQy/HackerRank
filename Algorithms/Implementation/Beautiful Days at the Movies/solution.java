import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) { 
        int reverse = 0;
        int counter = 0;
        double value = 0;
        double res = 0;
        int temp = 0;
        int n = 0;
        
        for(int x = i; x <= j; x++){
            reverse = 0;
            n = x;
            //get reverse number
            while(n != 0)
            {
              temp = n % 10;
              reverse = reverse * 10 + temp;
              n = n/10;
                
            }
            value = Math.abs(reverse - x);
            
            res = value / k;
            if(res - Math.floor(res) == 0) counter ++;
        }
        return counter;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
