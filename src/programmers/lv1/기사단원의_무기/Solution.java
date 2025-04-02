package programmers.lv1.기사단원의_무기;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) count += 2;
            }
            if (Math.sqrt(i) % 1 == 0) count --;
            answer += count > limit ? power : count;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 3, 2));
        System.out.println(s.solution(10, 3, 2));
    }
}
