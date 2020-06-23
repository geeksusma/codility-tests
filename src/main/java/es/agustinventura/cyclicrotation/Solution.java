package es.agustinventura.cyclicrotation;

public class Solution {
    public int[] solution(int[] A, int K) {
        int rotated[] = null;
        if (A.length == 0 || K == 0) {
            rotated = A;
        } else {
            rotated = A;
            for (int i=0; i<K; i++) {
                rotated = shiftRight(rotated);
            }
        }
        return rotated;
    }

    private int[] shiftRight(int[] rotated) {
        int newValue = rotated[0];
        int oldValue = 0;
        for (int i=0; i<rotated.length; i++) {
            if (i == rotated.length - 1) {
                rotated[0] = newValue;
            } else {
                oldValue = rotated[i+1];
                rotated[i+1] = newValue;
                newValue = oldValue;
            }

        }
        return rotated;
    }
}
