import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String dayOfProgrammer(int year) {
        int dayToplam = 243;
        if(year > 1918)
        	dayToplam += year % 400 == 0 ? 1 : year % 4 == 0 && year % 100 != 0 ? 1 : 0;
        else
        	dayToplam += year % 4 == 0 ? 1 : 0;
        if(year == 1918)
        	return "26.09.1918";
        else
        	return (256-dayToplam)+".09."+year; 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
