import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String arr[] = s.split(":");
        if(arr[2].contains("AM")){
            if(arr[0].equals("12"))
                arr[0] = "00";
        }
        else{
            if(!arr[0].equals("12"))
            arr[0] = String.valueOf(Integer.parseInt(arr[0])+12);
        }
        return arr[0]+":"+arr[1]+":"+arr[2].substring(0,2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}