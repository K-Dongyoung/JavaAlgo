package programmers.lv1._3진법_뒤집기;

public class Solution {
    public int solution(int n) {
        int remainder;
        int answer = 0;
        while(n > 0) {
            answer *= 3;
            remainder = n % 3;
            n = n / 3;
            answer += remainder;
        }
        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(45));
        System.out.println(s.solution(125));
    }
}
