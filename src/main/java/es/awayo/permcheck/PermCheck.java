package es.awayo.permcheck;

import java.util.HashSet;
import java.util.Set;

class PermCheck {
    public int solution(int[] A) {
        int solution = 1;
        int maxPosibleValue = A.length;
        Set<Integer> countValues = new HashSet<Integer>();

        for (int value: A) {
            if (maxPosibleValue < value) {
                solution = 0;
                break;
            } else if (countValues.contains(value)) {
                solution = 0;
                break;
            } else {
                countValues.add(value);
            }
        }

        return solution;
    }
}