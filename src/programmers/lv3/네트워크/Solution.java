package programmers.lv3.네트워크;

public class Solution {
    public int solution(int n, int[][] computers) {
        int[] visited = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i, computers, visited);
                answer++;
            }
        }
        return answer;
    }

    private static void dfs(int n, int[][] computers, int[] visited) {
        visited[n] = 1;
        for (int i = 0; i < visited.length; i++) {
            if (computers[n][i] == 1 && visited[i] == 0) {
                dfs(i, computers, visited);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(s.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
        System.out.println(s.solution(4, new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}, {0, 0, 1, 1}}));
        System.out.println(s.solution(4, new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));
    }
}
