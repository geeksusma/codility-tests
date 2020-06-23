package es.agustinventura.permmissingelement;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        if (A == null || A.length == 0) {
            return 1;
        }
        Set<Integer> numbersInRange = new HashSet<>(A.length + 1);
        for (int i=1; i<A.length+2; i++) {
            numbersInRange.add(i);
        }
        for (int i=0; i<A.length; i++) {
            numbersInRange.remove(A[i]);
        }
        return numbersInRange.iterator().next();
    }
}