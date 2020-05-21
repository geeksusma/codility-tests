package es.geeksusma.frogjumps;

public class FrogJumps {

    public int solution(int start, int end, int jumpSize) {
        // write your code in Java SE 8
        int totalPositions = end - start;

        return (int) Math.ceil(new Double(totalPositions) / new Double(jumpSize));
    }
}
