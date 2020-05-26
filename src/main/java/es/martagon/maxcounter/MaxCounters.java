package es.martagon.maxcounter;

class MaxCounters {

	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		int min = 0;

		boolean maximize = false;

		int index = 0;
		for (int j : A) {
			index = j - 1;
			if (index < N) {
				if (maximize && counters[index] < min) {
					counters[index] = min + 1;
				} else {
					counters[index]++;
				}
				if (counters[index] > max) {
					max = counters[index];
				}
			} else {
				maximize = true;
				min = max;
			}
		}

		if (maximize) {
			for (int i = 0;  i< counters.length; i++) {
				if (counters[i] < min)
					counters[i] = min;
			}
		}
		return counters;
	}
}
