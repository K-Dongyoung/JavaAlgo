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

    public int solution2(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            int temp = Math.min(citations[i], citations.length - i);
            if (h > temp) break;
            h = temp;
        }
        return h;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 0, 6, 1, 5}));
        // 0 1 3 5 6
    }
}
