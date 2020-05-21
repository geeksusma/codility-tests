package es.awayo.permmissingelement;

class PermMissing {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        for (int value : A) {
            sum += value;
        }
        return gauss(A.length + 1) - sum;
    }
    
    private int gauss(int N) {
        return N*(N + 1)/2;
    }
}