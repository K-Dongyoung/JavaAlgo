package programmers.lv2.전화번호_목록;

import java.util.*;

public class Solution2 {
    public boolean solution(String[] phone_book) {
        return f(phone_book, 0);
    }

    private boolean f(String[] phoneBook, int d) {
        List<String>[] a = new List[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new ArrayList<>();
        }

        for (String num : phoneBook) {
            a[num.charAt(d) - '0'].add(num);
        }

        for (int i = 0; i < 10; i++) {
            if (a[i].size() <= 1) continue;
            a[i].sort((x, y) -> Integer.compare(x.length(), y.length()));
            if (a[i].getFirst().length() == d + 1) return false;
            if (!f(a[i].toArray(new String[0]), d + 1)) return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(s.solution(new String[]{"123", "456", "789"}));
        System.out.println(s.solution(new String[]{"12", "123", "1235", "567", "88"}));
    }
}
