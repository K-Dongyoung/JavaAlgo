package programmers.lv2.다음_큰_숫자;

public class Solution {
    public int solution(int n) {
        int a = n, n_cnt = 0;
        while (a > 0) {
            n_cnt += a % 2;
            a /= 2;
        }
        for(int i = n + 1;; i++) {
            int b = i, cnt = 0;
            while (b > 0) {
                cnt += b % 2;
                b /= 2;
            }
            if (cnt == n_cnt) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(78));
        System.out.println(s.solution(15));
    }
}
