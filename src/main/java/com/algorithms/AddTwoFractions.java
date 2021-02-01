package com.algorithms;

public class AddTwoFractions {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int gcd2(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }

    static void lowest(int den3, int num3) {
        divideByZero(den3);
        int commonFactor = gcd(num3, den3);
        den3 = den3 / commonFactor;
        num3 = num3 / commonFactor;
        System.out.println(num3 + "/" + den3);
    }

    static void addFraction(int num1, int den1, int num2, int den2) {
        divideByZero(den1);
        int den3 = gcd2(den1, den2);
        den3 = (den1 * den2) / den3;
        int num3 = (num1) * (den3 / den1) + (num2) * (den3 / den2);
        lowest(den3, num3);
    }

    public static void main(String[] args) {
        int num1 = 1, den1 = 500, num2 = 2, den2 = 1500;
        System.out.print(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " is equal to ");
        addFraction(num1, den1, num2, den2);
    }

    private static void divideByZero(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("You cannot divide by 0!");
        }
    }
}
