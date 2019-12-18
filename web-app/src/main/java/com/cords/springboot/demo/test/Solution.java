package com.cords.springboot.demo.test;

/**
 * Created by renato on {2019-12-16}
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int result = 0;
        int numberValley = 0;
        boolean enterValley = false;

        for (int i = 0; i < n; i++){
            char c =  s.charAt(i);
            if ( Character.toString(c).equals("D")){
                result = result -1;


                //sequencia de consecutivos passos abaixo da linha
                //deteta se esta abaixo da linha
                if (result < 0 && enterValley==false){
                    numberValley = numberValley+ 1;
                    enterValley = true;
                }


            } else if (Character.toString(c).equals("U")){

                result = result +1;

                if (result >= 0){
                    enterValley = false;
                }

            }

        }

        String a = "";

        return numberValley;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // B//ufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // int n = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //String s = scanner.nextLine();

        int result = countingValleys(8, "UDDDUDUU");
        System.out.println(result);

      //  bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

       // scanner.close();
    }
}
