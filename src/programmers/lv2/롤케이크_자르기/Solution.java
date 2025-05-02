package programmers.lv2.롤케이크_자르기;

import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int[] cnt1 = new int[topping.length];
        int[] cnt2 = new int[topping.length];

        for (int i = 0; i < topping.length; i++) {
            s1.add(topping[i]);
            s2.add(topping[topping.length - 1 - i]);
            cnt1[i] = s1.size();
            cnt2[topping.length - 1 - i] = s2.size();
        }

        int answer = 0;
        for (int i = 0; i < topping.length - 1; i++) {
            if (cnt1[i] == cnt2[i + 1]) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
        System.out.println(s.solution(new int[]{1, 2, 3, 1, 4}));
    }
}
