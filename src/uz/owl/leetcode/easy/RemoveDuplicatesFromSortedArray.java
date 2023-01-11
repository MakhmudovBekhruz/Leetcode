package uz.owl.leetcode.easy;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        Solution solution = new Solution();
//        final int[] nums = {1,1};
        final int[] nums = {0, 0, 0, 0, 0, 1, 2, 2, 3, 3, 4, 4};
        final int i = solution.removeDuplicates(nums);
        System.out.println(i);
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int lastValue = nums[0];
            int lastValueIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > lastValue) {
                    lastValueIndex++;
                    nums[lastValueIndex] = nums[i];
                    lastValue = nums[i];
                }
            }
            return lastValueIndex + 1;
        }
    }
}
