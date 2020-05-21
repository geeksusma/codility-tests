package es.awayo.missinginteger;

import java.util.TreeSet;

public class MissingInteger {

    public int solution(int[] A) {
        TreeSet<Integer> positiveIntegers = new TreeSet<Integer>();

        for (int value : A) {
            if (value > 0) {
                positiveIntegers.add(value);
            }
        }

        int minInteger = 1;
        for (int positiveInteger: positiveIntegers) {
            if (positiveInteger == minInteger) {
                minInteger += 1;
            } else {
                break;
            }
        }

        return minInteger;
    }
}
