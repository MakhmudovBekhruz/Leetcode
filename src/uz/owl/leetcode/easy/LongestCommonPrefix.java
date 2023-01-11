package uz.owl.leetcode.easy;

/*
https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = new String[]{"abdfb","abdfbyhyh"};
        System.out.println(solution.longestCommonPrefix(a));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder result = new StringBuilder();
            int maxLen = 200;
            String[][] matrix = new String[strs.length][maxLen];

            int minLength = strs[0].length();
            for (int i = 0; i < strs.length; i++) {
                matrix[i] = strs[i].split("");
                if (minLength > strs[i].length()) {
                    minLength = strs[i].length();
                }
            }

            boolean allEqual;
            for (int i = 0; i < minLength; i++) {
                final String target = matrix[0][i];
                if (target == null) return result.toString();
                allEqual = true;
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].length() > i) {
                        allEqual = allEqual && matrix[j][i].equals(target);
                    } else {
                        return result.toString();
                    }
                }
                if (allEqual) {
                    result.append(target);
                } else {
                    return result.toString();
                }
            }

            return result.toString();
        }
    }
}
