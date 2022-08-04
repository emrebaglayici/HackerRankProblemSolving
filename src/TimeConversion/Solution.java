package TimeConversion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String timeConversion(String s) throws ParseException {
        DateFormat inputDf = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputDf = new SimpleDateFormat("HH:mm:ss");
        String result = null;
        Date date = null;
        try{
            date= inputDf.parse(s);
        }catch(ParseException pe){
            pe.printStackTrace();
        }

        if (date!=null){
            result=outputDf.format(date);
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(System.out)));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
