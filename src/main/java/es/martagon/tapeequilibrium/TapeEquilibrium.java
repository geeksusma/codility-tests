package es.martagon.tapeequilibrium;

class TapeEquilibrium {

	public static int solution(int[] A) {
		int total = 0;
		for (int i = 1; i < A.length; i++) {
			total += A[i];
		}

		int posibleMin = 0;
		int min = Math.abs(A[0] - total);
		int acum = 0;
		for (int i = 0; i < A.length - 1; i++) {
			acum += A[i];
			posibleMin = Math.abs(acum - total);
			if (posibleMin < min)
				min = posibleMin;
			total -= A[i + 1];
		}
		return min;
	}
}
