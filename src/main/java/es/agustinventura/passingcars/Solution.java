package es.agustinventura.passingcars;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        long MAX_PAIRS = 1_000_000;
        long carPairs = 0;
        long carsTravellingWest = Arrays.stream(A).filter(car -> car == 1).count();
        boolean lessThanMax = true;
        int i=0;
        while (i<A.length && lessThanMax) {
            int car = A[i];
            if (car == 0) {
                carPairs += carsTravellingWest;
                if (carPairs > MAX_PAIRS) {
                    carPairs = -1;
                    lessThanMax = false;
                }
            } else {
                carsTravellingWest--;
            }
            i++;
        }
        return (int) carPairs;
    }
}
