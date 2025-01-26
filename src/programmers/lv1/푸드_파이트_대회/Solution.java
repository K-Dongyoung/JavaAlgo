package programmers.lv1.푸드_파이트_대회;

public class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }
        answer.append(sb);
        answer.append(0);
        answer.append(sb.reverse());
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 3, 4, 6}));
        System.out.println(s.solution(new int[]{1, 7, 1, 2}));
    }
}
