package programmers.lv2.더_맵게;

import java.util.*;

public class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }
        int answer = 0;
        while (true) {
            if (pq.peek() >= K) break;
            if (pq.size() == 1) {
                answer = -1;
                break;
            }
            int s = pq.poll() + (pq.poll() * 2);
            answer++;
            pq.offer(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
