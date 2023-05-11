/* #####################   Code to implement Next Permutation (leetcode #31)  ########################

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], 
[2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. 
More formally, if all the permutations of the array are sorted in one container according to their lexicographical 
order, then the next permutation of that array is the permutation that follows it in the sorted container. If such 
arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1,n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        for(int i=n-1;i>=0 && index!=-1;i--){
            if(nums[i]>nums[index]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        int l = index + 1,r = n - 1;
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;r--;
        }
    }
}
