package es.awayo.frogriverone;

class FrogRiver {
    public int solution(int X, int[] A) {
        int noSolution = -1;
        boolean spacesOccupied[] = new boolean[X + 1];
        int sumObjetive = gauss(X);
        int sum = 0;

        for (int i = 0; i<A.length; i++) {
            int value = A[i];
            if (!spacesOccupied[value]) {
                sum += value;
                if (sum == sumObjetive) {
                    return i;
                }
                spacesOccupied[value] = true;
            }
        }

        return noSolution;
    }

    private int gauss(int N) {
        return N*(N + 1)/2;
    }
}