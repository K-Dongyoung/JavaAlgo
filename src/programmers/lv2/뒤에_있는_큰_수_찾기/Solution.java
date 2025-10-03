package programmers.lv2.뒤에_있는_큰_수_찾기;

import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] a = new int[n];
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            a[i] = -1;
            while(!s.isEmpty() && s.peek() <= numbers[i]) s.pop();
            if (!s.isEmpty()) a[i] = s.peek();
            s.push(numbers[i]);
        }
        return a;
    }

    public int[] solution2(int[] numbers) {
        int[] s = new int[numbers.length];
        s[s.length - 1] = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i > 0; i--) {
            s[i - 1] = Math.max(s[i], numbers[i - 1]);
        }

        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = -1;
            if (s[i] > numbers[i]) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] > numbers[i]) {
                        answer[i] = numbers[j];
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{2, 3, 3, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{9, 1, 5, 3, 6, 2})));
        System.out.println(Arrays.toString(s.solution(new int[]{5, 1, 4, 3, 6})));
    }
}
