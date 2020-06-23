package es.agustinventura.maxproductofthree;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        int maxProduct = 0;
        if (A.length > 2) {
            Arrays.sort(A);
            int maxProductBiggestNumbers = A[A.length-1] * A[A.length-2] * A[A.length-3];
            int maxProductLowestAndBiggestNumbers = A[A.length-1] * A[1] * A[0];
            if (maxProductBiggestNumbers > maxProductLowestAndBiggestNumbers) {
                maxProduct = maxProductBiggestNumbers;
            } else {
                maxProduct = maxProductLowestAndBiggestNumbers;
            }
        }
        return maxProduct;
    }
}
