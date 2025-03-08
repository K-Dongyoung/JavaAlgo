package programmers.lv2.연속_부분_수열_합의_개수;

import java.util.*;

public class Solution {
    public int solution(int[] elements) {
        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < elements.length; i++) {
            int sum = 0;
            for(int j = 0; j < elements.length - 1; j++) {
                sum += elements[(i + j) % elements.length];
                s.add(sum);
            }
        }

        return s.size() + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{7, 9, 1, 1, 4}));
    }
}
