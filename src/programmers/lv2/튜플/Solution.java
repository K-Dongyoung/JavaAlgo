package programmers.lv2.튜플;

import java.util.*;

public class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String a = "},\\{";
        String[] b = s.split(a);
        String[][] c = new String[b.length][];
        for (int i = 0; i < b.length; i++) {
            c[i] = b[i].split(",");
        }
        String[][] orderedArray = new String[b.length][];
        for (String[] set : c) {
            orderedArray[set.length - 1] = set;
        }

        int[] answer = new int[b.length];
        answer[0] = Integer.parseInt(orderedArray[0][0]);
        for (int i = 1; i < b.length; i++) {
            Set<String> s2 = new HashSet<>(Arrays.asList(orderedArray[i]));
            Set<String> s1 = new HashSet<>(Arrays.asList(orderedArray[i - 1]));
            s2.removeAll(s1);
            answer[i] = Integer.parseInt((String) s2.toArray()[0]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(s.solution("{{20,111},{111}}")));
        System.out.println(Arrays.toString(s.solution("{{123}}")));
        System.out.println(Arrays.toString(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }
}
