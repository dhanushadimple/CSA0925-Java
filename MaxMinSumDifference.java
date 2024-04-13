import java.util.Arrays;

public class MaxMinSumDifference {
    public static void main(String[] args) {
        int[] arr = {14, 16, 87, 36, 25, 89, 34};
        int m = 1;
        int n = 3;
        
        // Sort the array
        Arrays.sort(arr);
        
        // Find the Mth maximum number
        int mthMax = arr[arr.length - m];
        
        // Find the Nth minimum number
        int nthMin = arr[n - 1];
        
        // Calculate sum and difference
        int sum = mthMax + nthMin;
        int difference = Math.abs(mthMax - nthMin);
        
        // Output results
        System.out.println("1st Maximum Number = " + mthMax);
        System.out.println("3rd Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
