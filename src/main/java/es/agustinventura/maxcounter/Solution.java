package es.agustinventura.maxcounter;

import java.util.Arrays;

public class Solution {
    public int[] solution(int N, int[] A) {
        if (N > 0) {
            return operateCounters(N, A);
        }
        return new int[]{};
    }

    private int[] operateCounters(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0;
        for (int i=0; i<A.length; i++) {
            int operationCode = A[i];
            if (operationCode > 0 && operationCode < N + 2 ) {
                if (operationCode <= counters.length) {
                    int maxCandidate = incrementCounter(operationCode, counters);
                    if (maxCandidate > currentMax) {
                        currentMax = maxCandidate;
                    }
                } else {
                    Arrays.fill(counters, currentMax);
                }
            }
        }
        return counters;
    }

    private int incrementCounter(int operationCode, int[] counters) {
        operationCode--;
        counters[operationCode]++;
        return counters[operationCode];
    }
}
