package es.martagon.passingcar;

public class PassingCar {

	private static final long MAX = 1_000_000_000;

	public int solution(int[] A) {

		int sum = 0;
		for (int i : A)
			sum += i;

		int resto = 0;
		long total = 0;
		for (int i : A) {
			if (i == 1)
				resto++;
			else
				total += sum - resto;
		}

		return (total > MAX) ? -1 : new Long(total).intValue();
	}

}
