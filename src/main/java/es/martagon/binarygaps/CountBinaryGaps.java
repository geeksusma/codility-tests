package es.martagon.binarygaps;

class CountBinaryGaps {
	private final char ONE = '1';

	public int solution(int N) {
		// write your code in Java SE 8
		int maxGap = 0;
		int counterGap = 0;
		for (char readItem : Integer.toBinaryString(N).toCharArray()) {
			if (readItem == ONE) {
				if (counterGap > maxGap) {
					maxGap = counterGap;
				}
				counterGap = 0;
			} else {
				counterGap++;
			}
		}

		return maxGap;
	}
}
