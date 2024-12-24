package programmers.lv1.이상한_문자_만들기;

public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean tf = true;
        for(int i = 0; i < sb.length(); i ++) {
            if (sb.charAt(i) == ' ') {
                tf = false;
            } else if (tf) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            } else if (!tf) {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            tf = !tf;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution("try hello world"));
    }
}
