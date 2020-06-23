package es.agustinventura.numberofdiscintersections;

public class Solution {
    public int solution(int[] A) {
        int numberOfDiscIntersections = 0;
        if (A != null && A.length > 1) {
            for (int center=0; center< A.length; center++) {
                int radius = A[center];
                int offsetRadius = center + radius;
                for (int otherCenter = center+1; otherCenter<A.length; otherCenter++) {
                    int otherRadius = A[otherCenter];
                    int otherOffsetRadius = otherCenter - otherRadius;
                    if (otherOffsetRadius <= offsetRadius) {
                        numberOfDiscIntersections++;
                    }
                }
            }
        }
        return numberOfDiscIntersections;
    }
}
