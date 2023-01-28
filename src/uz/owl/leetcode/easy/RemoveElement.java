package uz.owl.leetcode.easy;

/*
https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.removeElement(new int[]{2}, 2));
        System.out.println(solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int result = 0;
            int index = 0;

            while ((index < nums.length)) {
                if (nums[index] == val || nums[index] == -1) {
                    for (int j = index; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                        nums[j + 1] = -1;
                    }
                }

                if (nums[index] != val) {
                    index++;
                } else {
                    nums[index] = -1;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != -1) {
                    result++;
                }
            }

            return result;
        }
    }
}
