package es.geeksusma.binarygaps;

class CountBinaryGaps {

    int calculateMaxGap(int valueAsInt) {
        String valueAsBinaryString = Integer.toBinaryString(valueAsInt);
        String[] splittedByOnes = valueAsBinaryString.split("1");

        int arrayLength = getArrayLength(splittedByOnes.length, valueAsBinaryString);

        return calculateMaximum(splittedByOnes, arrayLength);
    }

    private int calculateMaximum(String[] splittedByOnes, int arrayLength) {
        int maxGap = 0;
        for (int i = 0; i < arrayLength; i++) {
            int currentGapSize = splittedByOnes[i].length();
            if (!"".equals(splittedByOnes[i])) {
                if (currentGapSize > maxGap) {
                    maxGap = currentGapSize;
                }
            }
        }
        return maxGap;
    }

    private int getArrayLength(int arraySize, String numberAsBinaryString) {
        boolean shouldIncludeLast = numberAsBinaryString.endsWith("1");
        if (shouldIncludeLast) {
            return arraySize;
        } else {
            return arraySize - 1;
        }
    }
}
