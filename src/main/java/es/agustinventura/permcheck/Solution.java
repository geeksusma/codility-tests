package es.agustinventura.permcheck;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        boolean isPermutation = false;
        if (A != null) {
            if (A.length != 0) {
                Arrays.parallelSort(A);
                boolean error = false;
                int i=0;
                while (!error && i < A.length) {
                    error = A[i] != i+1;
                    i++;
                }
                isPermutation = !error;
            } else {
                isPermutation = true;
            }
        }
        if (isPermutation) {
            return 1;
        } else {
            return 0;
        }
    }
}
