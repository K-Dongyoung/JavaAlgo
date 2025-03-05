package programmers.lv2.영어_끝말잇기;

import java.util.*;

public class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> s = new HashSet<>();
        s.add(words[0]);

        for(int i = 1; i < words.length; i++) {
            if (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                return new int[]{i % n + 1, i / n  + 1};
            }
            if (s.contains(words[i])) {
                return new int[]{i % n + 1, i / n  + 1};
            }
            s.add(words[i]);
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(s.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(s.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}
