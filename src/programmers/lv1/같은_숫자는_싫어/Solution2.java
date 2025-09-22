package programmers.lv1.같은_숫자는_싫어;

import java.util.*;

public class Solution2 {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{4,4,4,3,3})));
    }
}
