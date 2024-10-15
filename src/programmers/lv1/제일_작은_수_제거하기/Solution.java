package programmers.lv1.제일_작은_수_제거하기;

import java.util.Arrays;


public class Solution {
    public int[] solution1(int[] arr) {
        int min = Arrays.stream(arr).min().orElseThrow();
        int[] array = Arrays.stream(arr).filter(i -> i > min).toArray();
        return array.length > 0 ? array : new int[]{-1};
    }

    public int[] solution2(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        int[] answer = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[j] = arr[i];
            j++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution2(new int[]{4, 3, 2, 1});
        System.out.println("solution1 = " + Arrays.toString(solution1));
    }
}
