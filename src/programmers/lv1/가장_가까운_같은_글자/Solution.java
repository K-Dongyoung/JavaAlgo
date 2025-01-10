package programmers.lv1.가장_가까운_같은_글자;

import java.util.Arrays;

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

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("banana")));
        System.out.println(Arrays.toString(s.solution("foobar")));
    }
}
