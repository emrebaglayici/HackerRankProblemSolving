package NumberLineJumps;
import java.io.*;
class Result {


    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer="";
        int xDif=x1-x2;
        int vDif=v1-v2;
        if (vDif<=0){
            answer="NO";
            return answer;
        }
        if (xDif%vDif==0)
            answer="YES";
        else
            answer="NO";
        return answer;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(System.out)));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
