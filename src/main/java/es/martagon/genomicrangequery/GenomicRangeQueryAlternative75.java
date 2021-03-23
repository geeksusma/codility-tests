package es.martagon.genomicrangequery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://app.codility.com/demo/results/training4ECAVH-M7D/
public class GenomicRangeQueryAlternative75 {

	private class Nucleotide {
		final int pos;
		final int value;

		public Nucleotide(int pos, int value) {
			this.pos = pos;
			this.value = value;
		}

	}

	// enlazamos cada nucleotido con su posición y ordenados de menor a mayor por su valor, nos quedamos con el primer elemento dentro del rango y ese será el menor.
	public int[] solution(String S, int[] P, int[] Q) {
		int[] result = new int[P.length];

		List<Nucleotide> dna = new ArrayList<>(S.length());
		for (int i = 0, max = S.length(); i < max; i++)
			dna.add(new Nucleotide(i, nucleotideCharToInt(S.charAt(i))));

		Collections.sort(dna, (c1, c2) -> {
			if (c1.value == c2.value)
				return 0;
			if (c1.value > c2.value)
				return 1;
			return -1;
		});

		for (int queryIndex = 0; queryIndex < P.length; queryIndex++) {
			for (Nucleotide ncl : dna) {
				if (ncl.pos >= P[queryIndex] && ncl.pos <= Q[queryIndex]) {
					result[queryIndex] = ncl.value;
					break;
				}
			}
		}
		return result;
	}

	private int nucleotideCharToInt(char value) {
		if ('A' == value)
			return 1;
		else if ('C' == value)
			return 2;
		else if ('G' == value)
			return 3;
		else
			return 4;// T
	}

}
