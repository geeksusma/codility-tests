package es.agustinventura.binarygap;

public class Solution {

	public int solution(int n) {
		if (n == 0) {
			return 0;
		}
		String binaryRepresentation = Integer.toBinaryString(n);
		if (binaryRepresentation.charAt(binaryRepresentation.length() - 1) == '0') {
			binaryRepresentation = binaryRepresentation.substring(0, binaryRepresentation.lastIndexOf('1'));
		}
		String[] splittedBy1Representation = binaryRepresentation.split("1");
		return maxLengthArray(splittedBy1Representation);
	}

	private int maxLengthArray(String[] splittedBy1Representation) {
		int maxLength = 0;
		for (String zeroes: splittedBy1Representation) {
			if (zeroes.length() > maxLength) {
				maxLength = zeroes.length();
			}
		}
		return maxLength;
	}
}
