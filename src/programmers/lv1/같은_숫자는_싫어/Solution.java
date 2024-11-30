package programmers.lv1.같은_숫자는_싫어;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int n : arr) {
            if (stack.peekLast() == null || stack.peekLast() != n) {
                stack.offerLast(n);
            }
        }
        int[] array = stack.stream().mapToInt(i -> i).toArray();
        return array;
    }

    public Deque<Integer> solution2(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int n : arr) {
            if (stack.peekLast() == null || stack.peekLast() != n) {
                stack.offerLast(n);
            }
        }
        return stack;
    }

    public Deque<Integer> solution3(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.offerLast(arr[0]);
        for (int n : arr) {
            if (stack.peekLast() != n) {
                stack.offerLast(n);
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
