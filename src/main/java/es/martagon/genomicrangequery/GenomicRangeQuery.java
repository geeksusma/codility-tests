package es.martagon.genomicrangequery;

//https://app.codility.com/demo/results/trainingMUKCAD-CQB/
public class GenomicRangeQuery {

	// clasificamos la secuencia por nucleotidos y utilizamos sumprefix para saber en el rengao de consulta si existe ese nucleotido
	public int[] solution(String S, int[] P, int[] Q) {
		int[] result = new int[P.length];
		
		int[][] dnaPrefix = new int[4][S.length() + 1]; 

		int nucleotideSecuence = 0;
		for (int secuenceIndex = 0, max = S.length(); secuenceIndex < max; secuenceIndex++) {
			nucleotideSecuence = nucleotideCharToInt(S.charAt(secuenceIndex));
			for (int nucleotideIndex = 0; nucleotideIndex < 4; nucleotideIndex++) {
				if (nucleotideIndex == nucleotideSecuence)
					dnaPrefix[nucleotideIndex][secuenceIndex + 1] = dnaPrefix[nucleotideIndex][secuenceIndex] + 1;
				else
					dnaPrefix[nucleotideIndex][secuenceIndex + 1] = dnaPrefix[nucleotideIndex][secuenceIndex];

			}
		}

		for (int queryIndex = 0; queryIndex < P.length; queryIndex++) {
			for (int i = 0; i < 4; i++) {
				if (dnaPrefix[i][Q[queryIndex]+1] - dnaPrefix[i][P[queryIndex]] > 0) {
					result[queryIndex] = i + 1;
					break;
				}
			}
		}
		return result;
	}
	
	private int nucleotideCharToInt(char value) {
		if ('A' == value)
			return 0;
		else if ('C' == value)
			return 1;
		else if ('G' == value)
			return 2;
		else
			return 3;// T
	}

}
