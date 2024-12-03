package programmers.lv2.숫자의_표현;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = i; sum <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(15));
    }
}
