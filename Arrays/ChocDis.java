// JAVA Code For Chocolate Distribution Problem

/*          Approach for Chocolate Distribution Problem. 

The idea is based on the observation that to minimize the difference, we must choose 
consecutive elements from a sorted packet. We first sort the array arr[0..n-1], then 
find the subarray of size m with the minimum difference between the last and first elements.   */

import java.util.*;
 
class ChocDis {
 
    // arr[0..n-1] represents sizes of packets. m is number of students.
    
    static int findMinDiff(int arr[], int n, int m)
    {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;
 
        // Sort the given packets
        Arrays.sort(arr);
 
        // Number of students cannot be
        // more than number of packets
        if (n < m)
            return -1;
 
        // Largest number of chocolates
        int min_diff = Integer.MAX_VALUE;

 
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                      40, 28, 42, 30, 44, 48, 43, 50 };
 
        int m = 7; // Number of students
 
        int n = arr.length;
        System.out.println("Minimum difference is "
                           + findMinDiff(arr, n, m));
    }
}
