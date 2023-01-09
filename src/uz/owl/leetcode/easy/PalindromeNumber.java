package uz.owl.leetcode.easy;

/*
https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        //return false for negative values
        if (x < 0) return false;

        //calculate length of the value
        int length = 0;
        double temporaryCopyOfTheValue = x;
        while(temporaryCopyOfTheValue >= 1) {
            temporaryCopyOfTheValue = Math.floor((temporaryCopyOfTheValue / 10));
            length++;
        }

        //remove equal values from left and right
        int step = 0;
        while(x >= 1) {
            double extendedValueOfTen  = Math.pow(10, length - 2 * step - 1);
            if (Math.floor(x / extendedValueOfTen) == x % 10) {
                x = (int) Math.floor(((x % extendedValueOfTen) / 10));
            } else {
                return false;
            }
            step++;
        }

        return true;
    }
}
