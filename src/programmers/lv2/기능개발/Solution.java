package programmers.lv2.기능개발;

import java.util.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> l = new ArrayList<>();
        int n = progresses.length;
        int[] days = new int[n];
        for (int i = 0; i < progresses.length; i++) {
            int work = (100 - progresses[i]);
            int day = work / speeds[i];
            day += work % speeds[i] > 0 ? 1 : 0;
            days[i] = day;
        }

        int count = 0;
        int a = days[0];
        for (int i = 0; i < n; i++) {
            if (a < days[i]) {
                a = days[i];
                l.add(count);
                count = 0;
            }
            count++;
        }
        l.add(count);

        int[] answer = new int[l.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = l.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }
}
