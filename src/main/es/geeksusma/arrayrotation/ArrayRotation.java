package es.geeksusma.arrayrotation;

class ArrayRotation {

    int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] newArray = new int[A.length];
        for(int i=0;i<A.length;i++) {
            int newPosition = i + K;

            if(newPosition == A.length) {
                newPosition = 0;
            } else if(newPosition > A.length) {
                newPosition = newPosition - A.length;
            }
            newArray[newPosition] = A[i];
        }

        return newArray;
    }
}
