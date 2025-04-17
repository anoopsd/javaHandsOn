package recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of times:");
//        int n = scanner.nextInt();
        String el = scanner.next();
//        printName(n, count);
//        printLinearly(0, n);
//        printLinearlyBacktracking(n, n);
//        printLinearlyBacktrackingReverse(0, n);
//        summation(0, n);
//        System.out.println(summationFunctional(n));
//        System.out.println(factorial(n));
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        reverseArray(0, arr.length - 1, arr);
//        System.out.println(Arrays.toString(arr));

        char[] arr2 = el.toCharArray();
        System.out.println(isPalindrome(arr2, 0, arr2.length));
    }

    public static void printName(int cnt,int count) {
        if(count == cnt) {
            return;
        }
        System.out.println("Anoop");
        printName(cnt, count + 1);
    }

    public static void printLinearly(int start, int n) {
        if (start > n) {
            return;
        }
        System.out.println(start);
        printLinearly(start + 1, n);
    }

    public static void printLinearlyBacktracking(int start, int n) {
        if (start < 1) {
            return;
        }
        printLinearlyBacktracking(start - 1, n);
        System.out.println(start);
    }

    public static void printLinearlyBacktrackingReverse(int start,int n) {
        if (start > n) {
            return;
        }
        printLinearlyBacktrackingReverse(start + 1, n);
        System.out.println(start);
    }

    public static void summation(int sum, int n) {
         if (n < 1) {
             System.out.println(sum);
             return;
         }
         summation(sum + n, n - 1);

    }

    public static int summationFunctional(int n) {
        if (n == 0) {
            return 0;
        }
        return n + summationFunctional(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void reverseArray(int l, int r, int[] arr) {
        if (l > r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(l + 1, r - 1, arr);
    }

    public static boolean isPalindrome(char[] arr, int start, int n) {
        if (start >= n/2) return true;
        if (arr[start] != arr[n - start - 1]) {
            return false;
        }
        return isPalindrome(arr, start + 1, n);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
