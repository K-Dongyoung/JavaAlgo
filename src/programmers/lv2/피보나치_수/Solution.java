package programmers.lv2.피보나치_수;

public class Solution {
    public int solution(int n) {
        int[] m = new int[n + 1];
        m[1] = 1;
        for(int i = 2; i <= n; i++) {
            m[i] = m[i - 1] + m[i - 2];
            m[i] %= 1234567;
        }
        return m[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3));
        System.out.println(s.solution(100000));
    }
}
