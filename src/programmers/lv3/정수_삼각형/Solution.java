package programmers.lv3.정수_삼각형;

// 시간초과 실패
public class Solution {
    public int solution(int[][] triangle) {
        return dfs(triangle, 0, 0);
    }

    private int dfs(int[][] triangle, int level, int index) {
        if (level == triangle.length - 1) return triangle[level][index];
        return triangle[level][index] + Math.max(dfs(triangle, level + 1, index), dfs(triangle, level + 1, index + 1));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }
}
