package programmers.lv1.체육복;

import java.util.*;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Set<Integer> r = new HashSet<>();
        for (int sn : reserve) r.add(sn);

        Arrays.sort(lost);
        for (int i = 0; i < lost.length; i++) {
            if (r.contains(lost[i])) {
                r.remove(lost[i]);
                lost[i] = 0;
                answer++;
            }
        }

        for (int sn : lost) {
            if (sn == 0) continue;
            if (r.contains(sn - 1)) {
                r.remove(sn - 1);
                answer++;
            } else if (r.contains(sn + 1)) {
                r.remove(sn + 1);
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(s.solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(s.solution(3, new int[]{3}, new int[]{1}));
        System.out.println(s.solution(10, new int[]{3,4,5,6,7}, new int[]{4,6}));
    }
}
