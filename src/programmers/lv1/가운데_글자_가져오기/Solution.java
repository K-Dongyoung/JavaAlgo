package programmers.lv1.가운데_글자_가져오기;

public class Solution {
    public String solution1(String s) {
        int i = s.length() / 2;
        if (s.length() % 2 == 1) {
            return "" + s.charAt(i);
        }
        return "" + s.charAt(i - 1) + s.charAt(i);
    }

    // 다른 사람 풀이
    public String solution2(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution1 = s.solution2("qwer");
        System.out.println(solution1);
    }
}
