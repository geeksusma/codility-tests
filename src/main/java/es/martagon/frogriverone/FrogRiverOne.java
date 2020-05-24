package es.martagon.frogriverone;

class FrogRiverOne {
	
	public int solution (int X , int [] A) {
		
		int [] leaf = new int [X];
		int total = X*(X+1)/2;
		int sum = 0;
		int posLeaf=0;
		
		for (int i=0; i<A.length; i++) {
			posLeaf = A[i];
			if(posLeaf<=X) {
				if (leaf[posLeaf-1] != 1) {
					leaf[posLeaf-1] =1;
					sum+=posLeaf;
				}
			}
			
			if (sum == total)
				return i;
		}
		return -1;
	}
}
