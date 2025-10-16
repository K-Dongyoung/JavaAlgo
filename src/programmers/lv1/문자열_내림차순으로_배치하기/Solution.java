package programmers.lv1.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());
        return String.join("", split);
    }

//    다른 사람 풀이
    public String solution2(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new StringBuilder(new String(charArray)).reverse().toString();
    }

    public String solution3(String s) {
        int[] upper = new int['Z' - 'A' + 1];
        int[] lower = new int['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a') {
                lower[c - 'a']++;
            } else {
                upper[c - 'A']++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = lower.length - 1; i >= 0; i--) {
            while (lower[i]-- > 0) {
                sb.append((char) (i + 'a'));
            }
        }
        for (int i = upper.length - 1; i >= 0; i--) {
            while (upper[i]-- > 0) {
                sb.append((char) (i + 'A'));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.solution3("Zbcdefg");
        System.out.println("answer = " + answer);
    }
}
