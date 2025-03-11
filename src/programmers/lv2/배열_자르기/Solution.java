package programmers.lv2.배열_자르기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        for(int i = (int) (left / n); i <= (right / n); i++) {
            for(int j = 0; j < n; j++) {
                if (left <= (long) i * n + j && (long) i * n + j <= right) {
                    answer[(int) (i * n + j - left)] = i > j ? i + 1 : j + 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, 2, 5)));
        System.out.println(Arrays.toString(s.solution(4, 7, 14)));
    }
}
