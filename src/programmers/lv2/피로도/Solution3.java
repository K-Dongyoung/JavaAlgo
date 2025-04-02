package programmers.lv2.피로도;

// 다른 사람 풀이 참조
public class Solution3 {

    static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        return dfs(k, dungeons);
    }

    private int dfs(int k, int[][] dungeons) {
        int count = 0;
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || k < dungeons[i][0]) continue;
            visited[i] = true;
            count = Math.max(count, 1 + dfs(k - dungeons[i][1], dungeons));
            visited[i] = false;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }
}
