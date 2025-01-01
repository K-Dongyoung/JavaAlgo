package programmers.lv1.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for (int i : d) {
            if (budget < i) {
                break;
            }
            budget -= i;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(s.solution(new int[]{2, 2, 3, 3}, 10));
    }
}
