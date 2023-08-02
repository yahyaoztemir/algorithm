import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int pickingNumbers(List<Integer> a) {
    	Collections.sort(a);
        int i = 0 ; 
        int max = 0 ; 
        while ( i < a.size() ){
            int k = 0 ; 
            int temp = i ; 
            while( i + 1 < a.size() && Math.abs(a.get(temp) - a.get(i+1)) <= 1 )
            {
                k++;
                i++;
            }
            if(k > max)
                max = k ;
            i++;
        }
        return max+1 ;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}