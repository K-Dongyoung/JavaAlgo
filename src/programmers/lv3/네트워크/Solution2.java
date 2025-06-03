package programmers.lv3.네트워크;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
    public int solution(int n, int[][] computers) {
        int[] visited = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                bfs(i, computers, visited);
                answer++;
            }
        }
        return answer;
    }

    private static void bfs(int n, int[][] computers, int[] visited) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(n);

        while (!q.isEmpty()) {
            int current = q.poll();
            visited[current] = 1;
            for (int i = 0; i < visited.length; i++) {
                if (computers[current][i] == 1 && visited[i] == 0) {
                    q.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(s.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
        System.out.println(s.solution(4, new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}, {0, 0, 1, 1}}));
        System.out.println(s.solution(4, new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));
    }
}
