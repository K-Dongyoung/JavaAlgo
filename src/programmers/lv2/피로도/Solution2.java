package programmers.lv2.피로도;

// 다른 사람 풀이 참조
public class Solution2 {

    static boolean[] visited;
    static int answer;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    private void dfs(int k, int[][] dungeons, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) continue;
            if (k < dungeons[i][0]) continue;
            visited[i] = true;
            dfs(k - dungeons[i][1], dungeons, count + 1);
            visited[i] = false;
        }
        answer = Math.max(answer, count);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }
}
