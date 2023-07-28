import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for ( int sayi : arr){
            if(map.containsKey(sayi)){
                int deger = map.get(sayi) ; 
                map.put(sayi, ++deger);
            }
            else
            {
                map.put(sayi,1);
            }
        }
        int max = 0 ; 
        int sonuc = 0 ; 
        Set<Integer> set = map.keySet();
        for(int key : set){
            System.err.println(key + " " + map.get(key));
            if(map.get(key) > max)
                {
                    max = map.get(key) ;
                    sonuc = key;
                }  
        }
        return sonuc; 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
