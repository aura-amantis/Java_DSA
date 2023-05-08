/* Code to implement Trapping Rain Water leetcode #42

Given n non-negative integers representing an elevation map where the width of each 
bar is 1, compute how much water it can trap after raining.

*/

class Trapping {
    public int trap(int[] height) {
      final int n = height.length;
      int ans = 0;
      int[] l = new int[n]; // l[i] := max(height[0..i])
      int[] r = new int[n]; // r[i] := max(height[i..n))
  
      for (int i = 0; i < n; ++i)
        l[i] = i == 0 ? height[i] : Math.max(height[i], l[i - 1]);
  
      for (int i = n - 1; i >= 0; --i)
        r[i] = i == n - 1 ? height[i] : Math.max(height[i], r[i + 1]);
  
      for (int i = 0; i < n; ++i)
        ans += Math.min(l[i], r[i]) - height[i];
  
      return ans;
    }
  }
