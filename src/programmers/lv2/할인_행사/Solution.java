package programmers.lv2.할인_행사;

import java.util.*;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> want_number = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            want_number.put(want[i], number[i]);
        }

        int answer = 0;

        Map<String, Integer> d = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            d.put(discount[i], d.getOrDefault(discount[i], 0) + 1);
        }

        for(int i = 0; i < discount.length - 10; i++) {
            if (want_number.equals(d)) answer++;

            if (d.get(discount[i]) == 1) d.remove(discount[i]);
            else d.put(discount[i], d.get(discount[i]) - 1);

            d.put(discount[i + 10], d.getOrDefault(discount[i + 10], 0) + 1);
        }

        return want_number.equals(d) ? answer + 1 : answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(
                new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
                        "pot", "banana", "apple", "banana"}));

        System.out.println(s.solution(
                new String[]{"apple"},
                new int[]{10},
                new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana",
                        "banana"}));
    }
}
