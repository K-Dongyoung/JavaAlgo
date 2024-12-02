package programmers.lv2.올바른_괄호;

import java.util.ArrayDeque;

public class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(Character c : s.toCharArray()) {
            if (c == '(') {
                stack.offerLast(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pollLast();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("(())()"));
    }
}
