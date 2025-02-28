package programmers.lv2.귤_고르기;

import java.util.*;

public class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int t : tangerine) {
            m.put(t, m.getOrDefault(t, 0) + 1);
        }
        List<Integer> c = new ArrayList<>(m.values());
        c.sort(Comparator.reverseOrder());
        int answer = 0;
        for(int i : c) {
            k -= i;
            answer += 1;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(s.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(s.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
