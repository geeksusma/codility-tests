package es.geeksusma.countingcars;

public class CountingCars {
    public int solution(int[] road) {

        int passing = 0;
        int toEast = 0;
        for (int car : road) {
            if (car == 0) {
                toEast++;
            }
            if (toEast > 0) {
                if (car == 1) {
                    passing = passing + toEast;
                    if (passing > 1000000000) {
                        return -1;
                    }
                }
            }
        }
        return passing;
    }
}
