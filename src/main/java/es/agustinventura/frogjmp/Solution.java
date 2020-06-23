package es.agustinventura.frogjmp;

class Solution {
    public int solution(int X, int Y, int D) {
        if (D < 1) {
            throw new IllegalArgumentException("Jump");
        }
        if (Y < X) {
            throw new IllegalArgumentException("End point should be greater or equals than starting point");
        }
        int distance = Y - X;
        int jumps;
        if (distance == 0 || distance < D) {
            jumps = 0;
        } else {
            jumps = distance / D;
            if (distance % jumps != 0) {
                jumps++;
            }
        }
        return jumps;
    }
}
