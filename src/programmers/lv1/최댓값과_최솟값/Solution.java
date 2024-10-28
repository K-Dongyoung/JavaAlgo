package programmers.lv1.최댓값과_최솟값;

public class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String c : split) {
            max = Math.max(Integer.parseInt(c), max);
            min = Math.min(Integer.parseInt(c), min);
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution("1 2 3 4");
        System.out.println(answer);
    }
}
