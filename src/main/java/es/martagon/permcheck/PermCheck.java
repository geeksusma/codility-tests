package es.martagon.permcheck;

class PermCheck {

	 public int solution(int[] A) {
		 int min = 1_000_000_000;
		 int max = 0;
		 int sum =0;
		 int sumCheck = 0;

		 for (int i : A) {
			 if (i<min)
				 min = i;
			 if (i >max)
				 max = i;
			 sum +=i;
		 }
		 
		 if (min >1) {
			 sumCheck = gauss(max) -gauss(min-1) - sum ;
		 }else {
			 sumCheck = gauss(max)  - sum ;
		 }
		 return sumCheck==0 ? 1: 0;
	 }
	 
	 private int gauss (int N) {
		 return N*(N+1)/2;
	 }
}
