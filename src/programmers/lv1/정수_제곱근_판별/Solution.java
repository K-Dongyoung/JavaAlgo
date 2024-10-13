package programmers.lv1.정수_제곱근_판별;

public class Solution {
    public long solution(long n) {
        int sqrt = (int) Math.sqrt(n);
        if (Math.pow(sqrt, 2) == n) {
            return (long) Math.pow((sqrt + 1), 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long solution1 = solution.solution(121);
        System.out.println("solution1 = " + solution1);
        long solution2 = solution.solution(3);
        System.out.println("solution2 = " + solution2);
    }
}
