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


    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.solution2("Zbcdefg");
        System.out.println("answer = " + answer);
    }
}
