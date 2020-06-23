package es.agustinventura.missinginteger;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] A) {
        if (A == null || A.length == 0) {
            return 1;
        } else {
            Set<Integer> arrayValues = Arrays.stream(A).boxed().collect(Collectors.toSet());
            boolean minimumNumberFound = false;
            int counter = 1;
            while (counter <= arrayValues.size() && !minimumNumberFound) {
                if (!arrayValues.contains(counter)) {
                    minimumNumberFound = true;
                } else {
                    counter++;
                }
            }
            if (counter == arrayValues.size() && !minimumNumberFound) {
                counter++;
            }
            return counter;
        }
    }
}
