package programmers.lv1.하샤드_수;

import java.util.Arrays;

public class Solution {
    public boolean solution1(int x) {
        String[] nums = String.valueOf(x).split("");
        int sum = Arrays.stream(nums).mapToInt(Integer::valueOf).sum();
        return x % sum == 0;
    }

    public boolean solution2(int x) {
        int sum = String.valueOf(x).chars().map(n -> n - '0').sum();
        return x % sum == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean solution1 = solution.solution2(10);
        System.out.println("solution1 = " + solution1);
        boolean solution2 = solution.solution2(11);
        System.out.println("solution1 = " + solution2);
    }
}
