package programmers.lv1.정수_내림차순으로_배치하기;


import java.util.Arrays;
import java.util.Collections;


public class Solution {
    public long solution1(long n) {
        char[] charArray = String.valueOf(n).toCharArray();
        String[] characters = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            characters[i] = "" + charArray[i];
        }
        Arrays.sort(characters, Collections.reverseOrder());
        return Long.parseLong(String.join("", characters));
    }

    public long solution2(long n) {
        String[] characters = Long.toString(n).split("");
        Arrays.sort(characters, Collections.reverseOrder());
        return Long.parseLong(String.join("", characters));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(118372) = " + solution.solution2(118372));
    }
}
