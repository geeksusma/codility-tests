package es.agustinventura.tapeequilibrium;

public class Solution {

    public int solution(int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        } else {
            return calculateMinimalDifference(A);
        }
    }

    private int calculateMinimalDifference(int[] A) {
        int minimalDifference = Integer.MAX_VALUE;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i=0; i < A.length; i++) {
            secondHalfSum += A[i];
        }

        for (int i=0; i<A.length; i++) {
            firstHalfSum += A[i];
            secondHalfSum -= A[i];
            int minimalCandidate = Math.abs(firstHalfSum - secondHalfSum);
            if (minimalCandidate < minimalDifference) {
                minimalDifference = minimalCandidate;
            }
        }
        return minimalDifference;
    }
}
