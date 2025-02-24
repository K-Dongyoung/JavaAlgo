package programmers.lv1.콜라_문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            int c = n / a * b;
            answer += c;
            n = n % a + c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 1, 20));
        System.out.println(s.solution(3, 1, 20));
    }
}
