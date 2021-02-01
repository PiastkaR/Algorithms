package com.algorithms;

public class SmallestSubarray {
    static int smallestSubWithSum(int arr[], int n, int x) {
        int minLength = n + 1;
        for (int start = 0; start < n; start++) {
            int currentSum = arr[start];
            if (currentSum > x)
                return 1;
            for (int end = start + 1; end < n; end++) {
                currentSum += arr[end];
                if (currentSum > x && (end - start + 1) < minLength)
                    minLength = (end - start + 1);
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        int arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int n = arr.length;
        int x = 280;
        int result = smallestSubWithSum(arr, n, x);
        if (result == n + 1)
            System.out.println("Not Possible");
        else
            System.out.println(result);
    }
}
