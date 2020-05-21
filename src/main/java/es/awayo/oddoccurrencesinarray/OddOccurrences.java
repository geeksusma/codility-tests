package es.awayo.oddoccurrencesinarray;

import java.util.*;

class OddOccurrences {

    public int solution(int[] A) {
        TreeSet<Integer> items = new TreeSet<Integer>();
        for (int value : A) {
            if (items.contains(value)) {
                items.remove(value);
            } else {
                items.add(value);
            }
        }

        return items.first();
    }

}