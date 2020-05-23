package es.martagon.permmissingelement;

class PermMissing {

	public int solution(int[] A) {
		// write your code in Java SE 8
		int[] track = new int[A.length];
		for (int i : A) {
			if (i - 1 < A.length) {
				track[i - 1] = 99;
			}
		}

		for (int i = 0; i < track.length; i++) {
			if (track[i] != 99)
				return i + 1;
		}
		return A.length + 1;
	}
}
