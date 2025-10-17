package programmers.lv2.주식가격;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            int cp = prices[i];
            while (top > -1 && prices[stack[top]] > cp) {
                int j = stack[top--];
                answer[j] = i - j;
            }
            stack[++top] = i;
        }

        while (top > -1) {
            int i = stack[top--];
            answer[i] = (n - 1) - i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 2, 3})));
    }
}
