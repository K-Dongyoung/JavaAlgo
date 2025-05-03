package programmers.lv2.뉴스_클러스터링;

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();
        int union = 0;
        int intersection = 0;

        for (int i = 0; i < str1.length() - 1; i++) {
            String sub1 = str1.substring(i, i + 2).toLowerCase();
            char c1 = sub1.charAt(0), c2 = sub1.charAt(1);
            if (c1 < 'a' || 'z' < c1 || c2 < 'a' || 'z' < c2) continue;
            m1.put(sub1, m1.getOrDefault(sub1, 0) + 1);
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String sub2 = str2.substring(i, i + 2).toLowerCase();
            char c1 = sub2.charAt(0), c2 = sub2.charAt(1);
            if (c1 < 'a' || 'z' < c1 || c2 < 'a' || 'z' < c2) continue;
            m2.put(sub2, m2.getOrDefault(sub2, 0) + 1);
        }

        Set<String> keys = new HashSet<>(m1.keySet());
        keys.addAll(m2.keySet());
        if (keys.isEmpty()) return 65536;

        for (String str : keys) {
            if (m1.containsKey(str) && m2.containsKey(str)) {
                union += Math.max(m1.get(str), m2.get(str));
                intersection += Math.min(m1.get(str), m2.get(str));
            } else {
                union += m1.containsKey(str) ? m1.get(str) : m2.get(str);
            }
        }

        double answer = (double) intersection / union;
        return (int) (answer * 65536);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("FRANCE", "french"));
        System.out.println(s.solution("handshake", "shake hands"));
        System.out.println(s.solution("aa1+aa2", "AAAA12"));
        System.out.println(s.solution("E=M*C^2", "e=m*c^2"));
    }
}
