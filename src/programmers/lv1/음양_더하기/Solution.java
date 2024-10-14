package programmers.lv1.음양_더하기;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : -absolutes[i];
//            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});
        System.out.println("solution1 = " + solution1);
    }
}
