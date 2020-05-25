package es.martagon.countdiv;

class CountDiv {

	public int solution(int A, int B, int K) {
		int count = 0;

		if (K == 1) {
			return B - A + 1;
		}

		// cuantos saltos doy de A a B k siendo A % K ==0
		if (A == B) {
			return A % K == 0 ? 1 : 0;
		}

		if (A != 0 && A < K) {
			A = K;
		}

		if (A + K <= B) {
			
			count = (B - A) / K;
			
			if (A % K == 0 || B%K==0)
				count++;
		}

		return count;
	}

}
