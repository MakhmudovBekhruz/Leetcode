package uz.owl.leetcode.easy;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("({[)"));
    }

    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (!stack.empty()) {
                    final Character peek = stack.peek();
                    if (peek == '(') {
                        if (s.charAt(i) == ')') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                    } else if (peek == '{') {
                        if (s.charAt(i) == '}') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                    } else if (peek == '[') {
                        if (s.charAt(i) == ']') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                    } else {
                        stack.push(s.charAt(i));
                    }
                } else {
                    stack.push(s.charAt(i));
                }
            }
            return stack.empty();
        }
    }
}
