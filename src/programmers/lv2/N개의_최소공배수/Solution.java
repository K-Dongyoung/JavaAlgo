package programmers.lv2.N개의_최소공배수;

import java.util.*;

public class Solution {
    public int solution(int[] arr) {
        Map<Integer, Integer> pCount = new HashMap<>();
        for(int a : arr) {
            for(int n = 2; ; n++) {
                if (a == 1) {
                    break;
                }
                int count = 0;
                while(a % n == 0) {
                    count++;
                    a /= n;
                }
                if(pCount.getOrDefault(n, 0) < count) {
                    pCount.put(n, count);
                }
            }
        }
        int answer = 1;
        for (Map.Entry<Integer, Integer> e : pCount.entrySet()) {
            answer *= Math.pow(e.getKey(), e.getValue());
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2, 6, 8, 14}));
        System.out.println(s.solution(new int[]{1, 2, 3}));
    }
}
