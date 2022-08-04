package CustomMinMax;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long sum=0,max=Long.MIN_VALUE,min=Long.MAX_VALUE;
        for (Integer integer : arr) {
            sum += integer;
            max = Math.max(max, integer);
            min = Math.min(min, integer);
        }
        System.out.println((sum-max)+" "+(sum-min));
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
