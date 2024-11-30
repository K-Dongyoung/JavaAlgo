package programmers.lv2.최솟값_만들기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int solution(int[] A, int[] B)
    {
        int answer = 0;
        Integer[] integerB = new Integer[B.length];
        for(int i = 0; i < B.length; i++) {
            integerB[i] = B[i];
        }
        Arrays.sort(A);
        Arrays.sort(integerB, Comparator.reverseOrder());

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * integerB[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int answer1 = s.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
        System.out.println("answer1 = " + answer1);
    }
}
