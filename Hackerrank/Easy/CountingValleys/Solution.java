import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int countingValleys(int steps, String path) {
    	int sonuc = 0; 
        int seviye = 0 ; 
        char[] arr = path.toCharArray();
        
        for(int i = 0 ; i < arr.length ; i++){
            
            seviye += arr[i] == 'U' ? 1 : -1 ; 
            
            if(seviye == -1 ){
                
                sonuc++ ; 
                while(seviye != 0){
                    i++;
                    if(i >= arr.length)
                        break;
                    seviye += arr[i] == 'U' ? 1 : -1 ; 
                    
                }
            }
        }
        return sonuc ; 
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}