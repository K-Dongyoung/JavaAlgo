package programmers.lv2.뉴스_클러스터링;

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> m1 = generateMap(str1);
        Map<String, Integer> m2 = generateMap(str2);
        int union = 0;
        int intersection = 0;

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

    private Map<String, Integer> generateMap(String str) {
        HashMap<String, Integer> m = new HashMap<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String sub1 = str.substring(i, i + 2).toLowerCase();
            char c1 = sub1.charAt(0), c2 = sub1.charAt(1);
            if (c1 < 'a' || 'z' < c1 || c2 < 'a' || 'z' < c2) continue;
            m.put(sub1, m.getOrDefault(sub1, 0) + 1);
        }
        return m;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("FRANCE", "french"));
        System.out.println(s.solution("handshake", "shake hands"));
        System.out.println(s.solution("aa1+aa2", "AAAA12"));
        System.out.println(s.solution("E=M*C^2", "e=m*c^2"));
    }
}
