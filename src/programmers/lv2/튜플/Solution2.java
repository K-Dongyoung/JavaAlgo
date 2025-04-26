package programmers.lv2.튜플;

import java.util.*;

public class Solution2 {
    public int[] solution(String s) {
        String[] a = s.substring(2, s.length() - 2).split("},\\{");
        String[][] b = new String[a.length][];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].split(",");
        }
        String[][] orderedArray = new String[a.length][];
        for (String[] set : b) {
            orderedArray[set.length - 1] = set;
        }

        Set<String> set = new HashSet<>();
        int[] answer = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (String n : orderedArray[i]) {
                if (set.add(n)) {
                    answer[i] = Integer.parseInt(n);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(s.solution("{{20,111},{111}}")));
        System.out.println(Arrays.toString(s.solution("{{123}}")));
        System.out.println(Arrays.toString(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }
}
