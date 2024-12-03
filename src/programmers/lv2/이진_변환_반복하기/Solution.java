package programmers.lv2.이진_변환_반복하기;

import java.util.Arrays;

public class Solution {
    public int[] solution(String s) {
        int countConversion = 0;
        int countZero = 0;
        while (!s.equals("1")) {
            int countOne = 0;
            String[] split = s.split("");
            for(String c : split) {
                if (c.equals("1")) {
                    countOne += 1;
                }
            }
            countZero += s.length() - countOne;
            s = Integer.toBinaryString(countOne);
            countConversion += 1;
        }

        return new int[]{countConversion, countZero};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("110010101001")));
    }
}
