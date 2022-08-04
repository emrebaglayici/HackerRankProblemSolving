package MinMaxSum;

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

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        List<Long> numbers=new ArrayList<>();
        long min=0,max=0,temp=0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j <= arr.size()-1; j++) {
                if(j==i){
                    continue;
                }
                max+=arr.get(j);
            }
            numbers.add(max);
            max=temp;
        }

        Collections.sort(numbers);
        System.out.print(numbers.get(0)+" "+ numbers.get(numbers.size()-1));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
