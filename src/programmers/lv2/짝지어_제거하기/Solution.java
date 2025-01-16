package programmers.lv2.짝지어_제거하기;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(Character c: s.toCharArray()) {
            if (c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("baabaa"));
        System.out.println(s.solution("cdcd"));
    }
}
