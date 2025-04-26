package programmers.lv2.전화번호_목록;

import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (isPrefix(phone_book[i], phone_book[j])) return false;
                break;
            }
        }
        return true;
    }

    private boolean isPrefix(String s1, String s2) {
        if (s1.length() >= s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(s.solution(new String[]{"123", "456", "789"}));
        System.out.println(s.solution(new String[]{"12", "123", "1235", "567", "88"}));
    }
}
