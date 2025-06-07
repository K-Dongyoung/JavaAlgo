package programmers.lv3.정수_삼각형;


public class Solution2 {
    public int solution(int[][] triangle) {
        for (int i = triangle.length - 1; i > 0; i--) {
            for (int j = 0; j < triangle[i - 1].length; j++) {
                triangle[i - 1][j] += Math.max(triangle[i][j], triangle[i][j + 1]);
            }
        }
        return triangle[0][0];
    }


    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }
}
