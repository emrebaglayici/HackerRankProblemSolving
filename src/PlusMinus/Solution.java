package PlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    static NumberFormat df = new DecimalFormat("#0.000000", DecimalFormatSymbols.getInstance(Locale.ENGLISH));


    public static void plusMinus(List<Integer> arr) {
        float zeros = 0, positives = 0, negatives = 0;
        double zerosRatio, positivesRatios, negativesRatios;
        for (Integer i : arr) {
            if (i == 0)
                zeros++;
            else if (i >= 0) {
                positives++;
            } else if (i < 0) {
                negatives++;
            }
        }
        zerosRatio = zeros / arr.size();
        positivesRatios = positives / arr.size();
        negativesRatios = negatives / arr.size();

        System.out.println(df.format(positivesRatios)+" \n"
        +df.format(negativesRatios)+" \n"
        +df.format(zerosRatio));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
