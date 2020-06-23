package es.agustinventura.distinct;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        long uniqueElements = 0;
        if (A != null && A.length !=0) {
            uniqueElements = Arrays.stream(A).distinct().count();
        }
        return Math.toIntExact(uniqueElements);
    }
}
