package programmers.x만큼_간격이_있는_n개의_숫자;

import java.util.Arrays;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] array1 = solution.solution(2, 5);
        long[] array2 = solution.solution(4, 3);
        long[] array3 = solution.solution(-4, 2);

        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("array3 = " + Arrays.toString(array3));
    }
}
