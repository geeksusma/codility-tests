package es.martagon.missinginteger;

import java.util.Arrays;

class MissingInteger {


	// sort and iterate nlogn +n
	public int solution(int[] A) {
		// N log N
		Arrays.parallelSort(A);
		int result = 1;
		for (int i : A) {
			if (i >= result) {
				if (i == result)
					result++;
				else
					return result;
			}
		}
		return result;
	}
	
	// idea alternativa...
	//	solution = gauss (1 a max) - gauss (1 a min ) - suma del set
	// set : pero necesito array positivos sin repetidos --> coste nlogn + n como minimo

}
