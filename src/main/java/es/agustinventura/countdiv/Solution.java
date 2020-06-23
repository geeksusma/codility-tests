package es.agustinventura.countdiv;

public class Solution {
    public int solution(int A, int B, int K) {
        if (A > B || K < 1) {
            return 0;
        } else {
            int divisors = (B / K) - ( A / K);
            if (A % K == 0) {
                divisors++;
            }
            return divisors;
        }
    }
}
