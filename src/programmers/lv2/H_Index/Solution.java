package programmers.lv2.H_Index;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            h = Math.max(h, Math.min(citations[i], citations.length - i));
        }
        return h;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 0, 6, 1, 5}));
        // 0 1 3 5 6
    }
}
