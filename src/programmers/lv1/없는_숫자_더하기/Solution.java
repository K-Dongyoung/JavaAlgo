package programmers.lv1.없는_숫자_더하기;


import java.util.Arrays;

public class Solution {
    public int solution1(int[] numbers) {
        int answer = 0;
        int[] a = new int[10];
        for (int number : numbers) {
            a[number] = 1;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public int solution2(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution2(new int[]{5,8,4,0,6,7,9});
        System.out.println("solution1 = " + solution1);
    }
}
