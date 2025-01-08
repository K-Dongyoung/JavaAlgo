package programmers.lv1.최소직사각형;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
        int w = 0, h = 0;
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            w = Math.max(w, sizes[i][0]);
            h = Math.max(h, sizes[i][1]);
        }
        return w * h;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(s.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }
}
