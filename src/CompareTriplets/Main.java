package CompareTriplets;

import java.util.*;

public class Main {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<>();
        int scorePointFirstPerson = 0;
        int scorePointSecondPerson = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                scorePointFirstPerson++;
            } else if (a.get(i) < b.get(i)) {
                scorePointSecondPerson++;
            }
        }
        score.add(0,scorePointFirstPerson);
        score.add(1,scorePointSecondPerson);
        return score;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        b.add(3);
        b.add(2);
        b.add(1);
        System.out.println(compareTriplets(a, b));
    }
}

