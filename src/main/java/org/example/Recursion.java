package org.example;

public class Recursion {
    public static void main(String[] args) {
        System.out.print("Print numbers from n to 1 : ");
        printNum(7);
        System.out.println();
        System.out.println("Print upto nth fibonacci numbers " + fibonacciNumber(5));
        int[] arr = {1, 2, 4, 5, 7, 8, 12, 23, 44, 56};
        System.out.println("Binary search with recursion : " + binarySearch(arr, 100, 0, arr.length - 1));
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

    private static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, e);
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, s, mid - 1);
        }
        return -1;
    }

}