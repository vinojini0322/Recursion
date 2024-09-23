package org.example;

public class Recursion {
    public static void main(String[] args) {
        System.out.print("Print numbers from n to 1 : ");
        printNum(7);
        System.out.println();
        System.out.println("Print upto nth fibonacci numbers " + fibonacciNumber(50));
    }

    //    Print numbers n -> 1
    private static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNum(n - 1);
    }

    //    Fibonacci number
    private static int fibonacciNumber(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

}