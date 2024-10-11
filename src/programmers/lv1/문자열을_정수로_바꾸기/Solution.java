package programmers.lv1.문자열을_정수로_바꾸기;

public class Solution {

    public int solution1(String s) {
        return Integer.parseInt(s);
    }

    public int solution(String s) {
        int sign = 1;
        int answer = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                answer = answer * 10 + c - 48;
            } else if (c == '-') {
                sign = -1;
            }
        }
        return answer * sign;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(\"-1234\") = " + solution.solution("-1234"));
    }
}
