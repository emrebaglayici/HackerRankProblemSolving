package GradingStudents;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> results=new ArrayList<>();
        for (Integer number:grades){
            int subs=(100-number)%5;
            int remainder=subs+number;
            if (remainder-number<3) {
                if (number+subs>=40)
                    results.add(number + subs);
                else
                    results.add(number);
            }else
                results.add(number);
        }
        return results;

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(System.out)));

    int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = Result.gradingStudents(grades);

    bufferedWriter.write(
            result.stream()
                    .map(Object::toString)
                    .collect(joining("\n"))
                    + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();
}

}
