package es.martagon.minavg;

public class MinAvgSlice {


	/* se puede limitar slice a un máximo de 3 para mejorar el rendimiento, 
	 * no garantiza la solución mínima aunque obtenga 100% en los test de codility.
	 */
	public int solution(int[] A) {
		int[] sum = new int[A.length + 1];

		for (int i = 0; i < A.length; i++) {
			sum[i + 1] = sum[i] + A[i];
		}
		
		double min = Double.MAX_VALUE;
		int minPosition = 0;
		for (int slice = 2; slice <= A.length; slice++) {
			for (int p = 0; p + slice <= A.length; p++) {
				double avgSlice = average(sum, p, slice);
				if (avgSlice < min) {
					min = avgSlice;
					minPosition = p;
				}
			}
		}

		return minPosition;
	}

	private double average(int[] sum, int p, int slice) {
		int q = p + slice;
		return (double) (sum[q] - sum[p]) / slice;
	}
}
