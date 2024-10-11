package programmers.lv1.약수의_합;


public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(12) = " + solution.solution(12));
        System.out.println("solution.solution(5) = " + solution.solution(5));
    }
}
