package programmers.lv1.시저_암호;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer.append(c);
                continue;
            }
            if ('a' <= c && c <= 'z') {
                c = (char) ('a' + (c - 'a' + n) % 26);
            } else if ('A' <= c && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + n) % 26);
            }

            answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AB", 1));
        System.out.println(s.solution("z", 1));
        System.out.println(s.solution("a B z", 4));
    }
}
