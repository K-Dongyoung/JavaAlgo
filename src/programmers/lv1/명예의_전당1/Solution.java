package programmers.lv1.명예의_전당1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if (pq.size() > k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(s.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }
}
