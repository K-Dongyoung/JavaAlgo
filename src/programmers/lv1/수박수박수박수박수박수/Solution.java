package programmers.lv1.수박수박수박수박수박수;

public class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
                continue;
            }
            sb.append("박");
        }

        return sb.toString();
    }

    public String solution2(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution2(3);
        System.out.println("solution1 = " + solution1);
    }
}
