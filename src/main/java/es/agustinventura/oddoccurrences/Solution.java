package es.agustinventura.oddoccurrences;


import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int solution(int[] A) {
		if (A.length == 0) {
			throw new IllegalArgumentException("Array can't be empty");
		}
		if (A.length % 2 == 0) {
			throw new IllegalArgumentException("Array should have even length");
		}
		Set<Integer> numberStack = new HashSet<>(A.length / 2);
		for (int i=0; i<A.length; i++) {
			int number = A[i];
			if (numberStack.contains(number)) {
				numberStack.remove(number);
			} else {
				numberStack.add(number);
			}
		}
		return numberStack.iterator().next();
	}
}
