package es.agustinventura.minavgslice;

public class Solution {
    public int solution(int[] A) {
        double minimumAverage = Double.MAX_VALUE;
        int minimumAverageSliceStart = 0;
        int sliceStart = 0;
        for (; sliceStart < A.length - 2; sliceStart++) {
            double twoElementsSliceAverage = ((double)(A[sliceStart] + A[sliceStart + 1]) / 2d);
            if (twoElementsSliceAverage < minimumAverage) {
                minimumAverage = twoElementsSliceAverage;
                minimumAverageSliceStart = sliceStart;
            }
            if (A.length > 2) {
                double threeElementsSliceAverage = ((double)(A[sliceStart] + A[sliceStart + 1] + A[sliceStart + 2])) / 3d;
                if (threeElementsSliceAverage < minimumAverage) {
                    minimumAverage = threeElementsSliceAverage;
                    minimumAverageSliceStart = sliceStart;
                }
            }
        }
        if (A.length > 2) {
            int twoElementsSliceAverage = (A[sliceStart] + A[sliceStart + 1]) / 2;
            if (twoElementsSliceAverage < minimumAverage) {
                minimumAverageSliceStart = sliceStart;
            }
        }
        return minimumAverageSliceStart;
    }
}
