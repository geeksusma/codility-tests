package es.awayo.maxcounters;

import org.assertj.core.util.VisibleForTesting;

class MaxCounter {

    private static final int NO_OPERATION = -1;

    public int[] solution(int N, int[] A) {
       int solution[] = new int[N];
       int maxValue = 0;
       int lastOperation = NO_OPERATION;

       for(int operation : A) {
           if (operation <= N) {
               solution[operation - 1]++;
               if (solution[operation - 1] > maxValue) {
                   maxValue = solution[operation - 1];
               }
           } else {
               if (lastOperation != N + 1) {
                   fillAll(solution, maxValue);
               }
           }
           lastOperation = operation;
       }

       return solution;
    }

    @VisibleForTesting
    void fillAll(int[] array, int value) {
        for(int i = 0 ; i < array.length ; i++) {
            array[i] = value;
        }
    }
}