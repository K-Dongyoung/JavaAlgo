package programmers.lv1.나누어_떨어지는_숫자_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution1(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                result.add(i);
            }
        }
        Collections.sort(result);
        return !result.isEmpty()
                ? result.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }

    public int[] solution2(int[] arr, int divisor) {
        int[] array = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        Arrays.sort(array);
        return array.length > 0 ? array : new int[]{-1};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution2(new int[]{5, 9, 7, 10}, 189);
        System.out.println("solution1 = " + Arrays.toString(solution1));
    }
}
