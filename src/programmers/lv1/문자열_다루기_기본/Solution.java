package programmers.lv1.문자열_다루기_기본;

public class Solution {
    public boolean solution(String s) {

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean a = s.solution("a234");
        boolean b = s.solution("1234");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
