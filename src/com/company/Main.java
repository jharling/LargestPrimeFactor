package com.company;

public class Main {

    public static void main(String[] args) {
        Long num = 600851475143L;
        System.out.println(lpf(num));
    }

    private static long lpf (long num) {
        long maxPrime = 0L;
        while (num % 2 == 0) {
            maxPrime = 2;
            num = num / 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                maxPrime = i;
                num = num / i;
            }
        }
        if (num > 2) {
            maxPrime = num;
        }
        return maxPrime;
    }
}
