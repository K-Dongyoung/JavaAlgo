package programmers.lv2.모음_사전;

import java.util.*;

public class Solution2 {
    List<String> dict = new ArrayList<>();

    public int solution(String word) {
        String[] vowels = {"A", "E", "I", "O", "U"};
        f(vowels, "", 0);
        return dict.indexOf(word);
    }

    private void f(String[] vowels, String word, int k) {
        if (k == 6) return;
        dict.add(word);
        for (String vowel : vowels) {
            f(vowels, word + vowel, k + 1);
        }
    }



    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("AAAAE"));
        System.out.println(s.solution("AAAE"));
        System.out.println(s.solution("I"));
        System.out.println(s.solution("EIO"));
    }
}
