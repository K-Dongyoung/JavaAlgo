package programmers.lv2.배열_자르기;

import java.util.*;

public class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        for(long i = left; i <= right; i++) {
            answer[(int) (i - left)] = i / n > i % n ? (int) (i / n) + 1 : (int) (i % n) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, 2, 5)));
        System.out.println(Arrays.toString(s.solution(4, 7, 14)));
    }
}
