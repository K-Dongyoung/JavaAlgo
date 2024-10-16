package programmers.lv1.핸드폰_번호_가리기;

public class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                sb.append("*");
            } else {
                sb.append(phone_number.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution("01033334444");
        System.out.println("solution1 = " + solution1);
    }
}
