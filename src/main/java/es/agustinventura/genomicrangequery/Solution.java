package es.agustinventura.genomicrangequery;

public class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        if (S == null || S.equalsIgnoreCase("") || S.trim().equalsIgnoreCase("") || P == null || P.length == 0 || Q == null || Q.length == 0) {
            return new int[]{};
        } else {
            int[] queriesResult = new int[P.length];
            for (int i=0; i<P.length; i++) {
                queriesResult[i] = getMinimumImpact(S, P[i], Q[i]);
            }
            return queriesResult;
        }
    }

    private int getMinimumImpact(String S, int start, int end) {
        String nucleotideSubstring = S.substring(start, end + 1);
        return findMinimumImpact(nucleotideSubstring.toCharArray());
    }

    private int findMinimumImpact(char[] nucleotides) {
        int minimumValue = Integer.MAX_VALUE;
        boolean minimumFound = false;
        int i = 0;
        while (!minimumFound && i<nucleotides.length) {
            int nucleotideImpact = mapNucleotideToImpact(nucleotides[i]);
            if (nucleotideImpact < minimumValue) {
                minimumValue = nucleotideImpact;
            }
            if (minimumValue == 1) {
                minimumFound = true;
            }
            i++;
        }
        return minimumValue;
    }

    private int mapNucleotideToImpact(char c) {
        int impact = 0;
        switch (c) {
            case 'A':
                impact = 1;
                break;
            case 'C':
                impact = 2;
                break;
            case 'G':
                impact = 3;
                break;
            case 'T':
                impact = 4;
                break;
        }
        return impact;
    }
}
