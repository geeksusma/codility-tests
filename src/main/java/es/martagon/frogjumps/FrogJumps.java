package es.martagon.frogjumps;

class FrogJumps {

	public int solution (int X, int Y, int D) {
		int diff= Y-X;
		int solution = diff /D;
		return (diff % D == 0) ? solution : ++solution;
	}
}
