package uz.owl.leetcode.easy;


/*
https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCVII"));
    }

    static class Solution {
        int romanToInt(String s) {

            if (s.length() == 1) {
                switch (s) {
                    case "I":
                        return 1;
                    case "V":
                        return 5;
                    case "X":
                        return 10;
                    case "L":
                        return 50;
                    case "C":
                        return 100;
                    case "D":
                        return 500;
                    case "M":
                        return 1000;
                }
            }

            int result = 0;
            int prev = 0;

            final String[] split = s.split("");
            for (int i = split.length - 1; i >= 0; i--) {
                final int roman = romanToInt(split[i]);
                if (prev > roman) {
                    result -= roman;
                } else {
                    result += roman;
                }
                prev = roman;
            }

            return result;
        }
    }
}


