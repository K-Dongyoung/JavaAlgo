package programmers.lv2.괄호_회전하기;

import java.util.*;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> dq = new ArrayDeque<>();
        for(Character c : s.toCharArray()) {
            dq.offer(c);
        }

        for(int i = 0; i < s.length(); i++) {
            if (findRightP(dq)) answer ++;
            dq.offer(dq.poll());
        }

        return answer;
    }

    public boolean findRightP(Deque<Character> dq) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> m = Map.of('(', ')', '[', ']', '{', '}');

        for(Character c : dq) {
            if (m.containsKey(c)) {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) return false;
            if (!m.get(stack.peek()).equals(c)) return false;

            stack.pop();
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("[](){}"));
        System.out.println(s.solution("}]()[{"));
        System.out.println(s.solution("[)(]"));
        System.out.println(s.solution("}}}"));
    }
}
