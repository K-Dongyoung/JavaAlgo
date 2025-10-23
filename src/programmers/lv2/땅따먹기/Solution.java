package programmers.lv2.땅따먹기;

public class Solution {

    int solution(int[][] land) {

        int n = land.length;
        int m = land[0].length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    if (k != j) {
                        max = Math.max(max, land[i - 1][k]);
                    }
                }
                land[i][j] += max;
            }
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            max = Math.max(max, land[n - 1][i]);
        }

        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
    }
}
