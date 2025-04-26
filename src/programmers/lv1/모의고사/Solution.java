package programmers.lv1.모의고사;

import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {
        int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            count[0] += i % 5 + 1 == answers[i] ? 1 : 0;
            count[1] += second[i % second.length] == answers[i] ? 1 : 0;
            count[2] += third[i % third.length] == answers[i] ? 1 : 0;
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) result.add(i + 1);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{1, 3, 2, 4, 2})));
    }
}
