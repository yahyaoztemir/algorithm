import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int pageCount(int n, int p) {
        int on = 0 , arka = 0 ;
        n = n % 2 == 0 ? n+1 : n ;
        for( int i = 1 ; i < n ; i+=2)
        {
            if( i == p || i-1 == p ){
               break;
            }
            else
                on++;
        } 
        
        for( int k = n ; k > 1 ; k-=2 ){
            if( k == p || k-1 == p)
                break;
            else
                arka++;
        }
        return on < arka ? on : arka;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}