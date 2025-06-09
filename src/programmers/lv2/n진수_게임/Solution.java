package programmers.lv2.n진수_게임;

public class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; sb.length() < t; i++) {
            String s = Integer.toString(i, n).toUpperCase();
            for (int j = 0; j < s.length(); j++) {
                count++;
                if (count % m == p % m) sb.append(s.charAt(j));
                if (sb.length() == t) return sb.toString();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 4, 2, 1));
        System.out.println(s.solution(16, 16, 2, 1));
        System.out.println(s.solution(16, 16, 2, 2));
    }
}
