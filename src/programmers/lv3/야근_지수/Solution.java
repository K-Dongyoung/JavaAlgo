package programmers.lv3.야근_지수;

import java.util.*;

public class Solution {
    public long solution(int n, int[] works) {
        TreeMap<Integer, Integer> m = new TreeMap<>(Collections.reverseOrder());
        for (int w : works) {
            m.put(w, m.getOrDefault(w, 0) + 1);
        }

        while (n > 0 && !m.isEmpty()) {
            int key = m.firstKey();
            int c = m.get(key);
            if (c > n) {
                m.put(key, c - n);
                if (key - 1 > 0) m.put(key - 1, m.getOrDefault(key - 1, 0) + n);
                n = 0;
            } else {
                n -= c;
                if (key - 1 > 0) m.put(key - 1, m.getOrDefault(key - 1, 0) + c);
                m.remove(key);
            }
        }

        long answer = 0;
        while (!m.isEmpty()) {
            int key = m.firstKey();
            answer += (long) Math.pow(key, 2) * m.get(key);
            m.remove(key);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4, new int[]{4, 3, 3}));
        System.out.println(s.solution(1, new int[]{2, 1, 2}));
        System.out.println(s.solution(3, new int[]{1, 1}));
    }
}
