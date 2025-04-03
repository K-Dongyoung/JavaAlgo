package programmers.lv2.캐시;

import java.util.*;

public class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        Set<String> cache = new HashSet<>();
        Deque<String> q = new ArrayDeque<>();
        int answer = 0;

        for (String s : cities) {
            String city = s.toLowerCase();
            if (cache.contains(city)) {
                q.remove(city);
                q.offer(city);
                answer++;
                continue;
            }

            if (cache.size() == cacheSize) {
                cache.remove(q.poll());
            }

            cache.add(city);
            q.offer(city);
            answer += 5;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        System.out.println(s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        System.out.println(s.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(s.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(s.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
        System.out.println(s.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
