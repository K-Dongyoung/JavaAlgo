package programmers.lv1.두_정수_사이의_합;

public class Solution {
    public long solution1(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a, b); i < Math.max(a, b) + 1 ; i++) {
            answer += i;
        }
        return answer;
    }

    public long solution2(long a, long b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long solution1 = solution.solution2(1, 100);
        System.out.println("solution1 = " + solution1);
    }
}
