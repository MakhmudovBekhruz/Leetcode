package uz.owl.leetcode.medium;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class FindTheIndexOfTheFirstOccurrenceInString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("mississippi", "issipi"));
//        System.out.println(solution.strStr("sadbutsad", "sad"));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            final char[] stack = haystack.toCharArray();
            final char[] part = needle.toCharArray();
            int indexOfStack = 0;
            int indexOfPart = 0;
            int lastStartIndex = -1;
            while (indexOfStack < stack.length) {
                if (stack[indexOfStack] == part[indexOfPart]) {
                    if (indexOfPart == (part.length - 1)) {
                        return indexOfStack - part.length + 1;
                    } else {
                        indexOfPart++;
                    }
                    if (lastStartIndex == -1) {
                        lastStartIndex = indexOfStack;
                    }
                } else {
                    indexOfPart = 0;
                    if (lastStartIndex != -1) {
                        indexOfStack = lastStartIndex;
                    }
                    lastStartIndex = -1;
                }
                indexOfStack++;
            }
            return -1;
        }
    }
}
