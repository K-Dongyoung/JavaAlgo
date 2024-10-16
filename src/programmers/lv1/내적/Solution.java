package programmers.lv1.내적;


import java.util.stream.IntStream;

public class Solution {
    public int solution1(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    public int solution2(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution2(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
        System.out.println("solution1 = " + solution1);
    }
}
