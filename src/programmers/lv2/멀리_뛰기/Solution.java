package programmers.lv2.멀리_뛰기;

public class Solution {
    public long solution(int n) {
        if (n < 3) {
            return n;
        }
        long[] m = new long[n + 1];
        m[1] = 1;
        m[2] = 2;
        for(int i = 3; i <= n; i++) {
            m[i] = (m[i - 2] + m[i - 1]) % 1234567L;
        }
        return m[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4));
        System.out.println(s.solution(3));
        System.out.println(s.solution(2000));
    }
}
