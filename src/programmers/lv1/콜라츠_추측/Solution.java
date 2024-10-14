package programmers.lv1.콜라츠_추측;

public class Solution {
    public int solution(long num) {
        for (int i = 0; i <= 500; i++) {
            if (num == 1) {
                return i;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(6);
        System.out.println("solution1 = " + solution1);
    }
}
