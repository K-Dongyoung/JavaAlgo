package programmers.lv2.예상_대진표;

public class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer += 1;
        }

        return answer;
    }
}
