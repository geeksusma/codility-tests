package es.geeksusma.distinct;

import java.util.Set;
import java.util.TreeSet;

class CountDistinctElements {

    int solution(int[] A) {
        Set<Integer> elements = new TreeSet();

        for (int i1 : A) {
            elements.add(i1);
        }

        return elements.size();
    }
}