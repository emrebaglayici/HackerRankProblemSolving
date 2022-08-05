package BetweenTwoSets;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
class Result {

    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static int lcm(int a,int b){
        if(a==0 || b==0){
            return 0;
        }else {
            int gcd=gcd(a,b);
            return Math.abs((a*b)/gcd);
        }
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int counter=0;

        int lcm=a.get(0);
        for (Integer i:a){
            lcm=lcm(lcm,i);
        }

        int gcd=b.get(0);
        for (Integer i:b){
            gcd=gcd(gcd,i);
        }
        int multiple=0;
        while (multiple<=gcd){
            multiple+=lcm;
            if (gcd%multiple==0)
                counter++;
        }
        return counter;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(System.out)));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
