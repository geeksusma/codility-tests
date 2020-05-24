package es.martagon.permcheck;

import java.util.Arrays;

class PermCheck {

	public int solution(int[] A) {
		Arrays.parallelSort(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1)
				return 0;
		}
		return 1;
	}
	 
	 
}
