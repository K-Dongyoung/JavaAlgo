package programmers.lv2.카펫;

import java.util.Arrays;

/*
w >= 3, y >= 3, w >= y, w와 y는 자연수
2w + 2h - 4 = brown
w + h = brown / 2 + 2
(w-2)(h-2) = yellow
w*h -2w -2h + 4 = yellow
w*h = yellow + brown
*/
public class Solution {
    public int[] solution(int brown, int yellow) {
        int w, h;
        int x = brown / 2 + 2, y = brown + yellow;
        for(int i = 3;; i++){
            w = i;
            h = x - w;
            if (w * h == y) return new int[]{Integer.max(w, h), Integer.min(w, h)};
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(10, 2)));
        System.out.println(Arrays.toString(s.solution(8, 1)));
        System.out.println(Arrays.toString(s.solution(24, 24)));
    }
}
