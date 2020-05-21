package es.awayo.tapeequilibrium;

class TapeEquilibrium {
    public int solution(int[] A) {
        int solution = Integer.MAX_VALUE;
        int partialOperations[][] = new int[A.length][3];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            partialOperations[i][0] = sum;
        }
        for (int i = 0; i < A.length; i++) {
            partialOperations[i][1] = sum - partialOperations[i][0];
        }
        for (int i = 0; i < A.length - 1; i++) {
            int accumulateAbsoluteDiference = Math.abs(partialOperations[i][1] - partialOperations[i][0]);
            partialOperations[i][2] = accumulateAbsoluteDiference;
            if (accumulateAbsoluteDiference < solution) {
                solution = accumulateAbsoluteDiference;
            }
        }

        return solution;
    }
}