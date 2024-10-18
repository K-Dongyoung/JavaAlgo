package programmers.lv1.약수의_개수와_덧셈;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            answer += count(i) % 2 == 0 ? i : -i;
        }
        return answer;
    }

    public int count(int n) {
        int answer = 0;
        int ceil = (int) Math.sqrt(n) + 1;
        for (int i = 1; i < ceil; i++) {
            if (n % i == 0) {
                int a = n / i;
                answer += a != i ? 2 : 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(24, 27);
        System.out.println("solution1 = " + solution1);
    }
}
