package programmers.lv1.과일_장수;

import java.util.*;

class Solution2 {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        for (int i = score.length - m; 0 <= i; i -= m) {
            answer += m * score[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
