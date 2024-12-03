package programmers.lv1.크기가_작은_부분문자열;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(p) >= Long.parseLong(t.substring(i, i + p.length()))) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("70", "70"));
    }
}
