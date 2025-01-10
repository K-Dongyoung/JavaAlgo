package programmers.lv1.가장_가까운_같은_글자;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] solution(String s) {
        int[] ch = new int[26];
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if (ch[s.charAt(i) - 'a'] == 0) {
                answer[i] = -1;
            } else {
                answer[i] = i - ch[s.charAt(i) - 'a'] + 1;
            }
            ch[s.charAt(i) - 'a'] = i + 1;
        }
        return answer;
    }

    public int[] solution2(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> ch = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer[i] = i - ch.getOrDefault(c, i + 1);
            ch.put(c, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution2("banana")));
        System.out.println(Arrays.toString(s.solution2("foobar")));
    }
}
