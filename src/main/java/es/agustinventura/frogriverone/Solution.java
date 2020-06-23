package es.agustinventura.frogriverone;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int X, int[] A) {
        int firstSecondRiverIsTraversable = -1;
        if  (A != null && A.length != 0 && A.length > X - 1) {
            firstSecondRiverIsTraversable = calculateSecond(X, A);
        }
        return firstSecondRiverIsTraversable;
    }

    private int calculateSecond(int X, int[] A) {
        Map<Integer, Integer> positions = new HashMap<>(X);
        for (int i=1; i <= X; i++) {
            positions.put(i, null);
        }
        boolean riverIsTraversable = false;
        int second = 0;
        while (second < A.length && !riverIsTraversable) {
            positions.put(A[second], second);
            riverIsTraversable = !positions.values().contains(null);
            if (!riverIsTraversable) {
                second++;
            }
        }
        if (positions.values().contains(null)) {
            return -1;
        } else {
            return second;
        }
    }
}
