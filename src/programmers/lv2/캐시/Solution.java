package programmers.lv2.캐시;

import java.util.*;

public class Solution {
    // gpt가 분석한 그래프 있음.
    // 히트율, 캐시 크기에 따라 두 방법 성능 차이가 있음.
    // 캐시 크기가 작으면 유리함. ArrayDeque의 remove가 O(n)임.
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

    // 링크 끊고 잇는 데 시간이 더 걸릴 수 있음, 캐시 크기가 크면 유리함: remove가 O(1)임.
    public int solution2(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        Set<String> cache = new LinkedHashSet<>();
        int answer = 0;

        for (String s : cities) {
            String city = s.toLowerCase();
            if (cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer++;
                continue;
            }

            if (cache.size() == cacheSize) {
                cache.remove(cache.iterator().next());
            }

            cache.add(city);
            answer += 5;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] cities = new String[100_000];
        Random random = new Random();
        for (int i = 0; i < cities.length; i++) {
            cities[i] = "Seoul" + random.nextInt(100);
        }

        int cacheSize = 10;
        System.out.println("cacheSize = " + cacheSize);

        // 기존 방식 (HashSet + Queue)
        long start1 = System.nanoTime();
        int result1 = s.solution(cacheSize, cities);
        long end1 = System.nanoTime();
        System.out.println("HashSet+Queue 방식: " + (end1 - start1) / 1_000_000.0 + " ms " + result1);

        // 개선 방식 (LinkedHashSet)
        long start2 = System.nanoTime();
        int result2 = s.solution2(cacheSize, cities);
        long end2 = System.nanoTime();
        System.out.println("LinkedHashSet 방식: " + (end2 - start2) / 1_000_000.0 + " ms " + result2);
        System.out.println();



        cacheSize = 100;
        System.out.println("cacheSize = " + cacheSize);

        // 기존 방식 (HashSet + Queue)
        start1 = System.nanoTime();
        result1 = s.solution(cacheSize, cities);
        end1 = System.nanoTime();
        System.out.println("HashSet+Queue 방식: " + (end1 - start1) / 1_000_000.0 + " ms " + result1);

        // 개선 방식 (LinkedHashSet)
        start2 = System.nanoTime();
        result2 = s.solution2(cacheSize, cities);
        end2 = System.nanoTime();
        System.out.println("LinkedHashSet 방식: " + (end2 - start2) / 1_000_000.0 + " ms " + result2);
        System.out.println();



        cacheSize = 1000;
        System.out.println("cacheSize = " + cacheSize);

        // 기존 방식 (HashSet + Queue)
        start1 = System.nanoTime();
        result1 = s.solution(cacheSize, cities);
        end1 = System.nanoTime();
        System.out.println("HashSet+Queue 방식: " + (end1 - start1) / 1_000_000.0 + " ms " + result1);

        // 개선 방식 (LinkedHashSet)
        start2 = System.nanoTime();
        result2 = s.solution2(cacheSize, cities);
        end2 = System.nanoTime();
        System.out.println("LinkedHashSet 방식: " + (end2 - start2) / 1_000_000.0 + " ms " + result2);

//        System.out.println(s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
//        System.out.println(s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
//        System.out.println(s.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
//        System.out.println(s.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
//        System.out.println(s.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
//        System.out.println(s.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
