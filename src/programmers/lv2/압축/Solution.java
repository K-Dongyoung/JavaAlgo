package programmers.lv2.압축;

import java.util.*;

public class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> d = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            d.put(Character.toString('A' + i), i + 1);
        }

        int n = 27;

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < msg.length(); i++) {
            StringBuilder substring = new StringBuilder();
            substring.append(msg.charAt(i));
            int temp = d.get(String.valueOf(msg.charAt(i)));
            for (int j = i + 1; j < msg.length(); j++, i = j - 1) {
                substring.append(msg.charAt(j));
                if (!d.containsKey(substring.toString())) {
                    d.put(substring.toString(), n++);
                    break;
                }
                temp = d.get(substring.toString());
            }
            l.add(temp);
        }


        int[] answer = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
             answer[i] = l.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("KAKAO")));
        System.out.println(Arrays.toString(s.solution("TOBEORNOTTOBEORTOBEORNOT")));
        System.out.println(Arrays.toString(s.solution("ABABABABABABABAB")));
    }
}
