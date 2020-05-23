package es.martagon.arrayrotation;

class ArrayRotation {

	public int[] solution(int[] A, int K) {
		if (K >0 &&  A.length>0) {
			int [] result  = new int [A.length];
			for (int i=0, max = A.length;i<max; i++) {
				result[(i+K)%max]=A[i];
			}
			return result;
		}
		return A;
	}
}
