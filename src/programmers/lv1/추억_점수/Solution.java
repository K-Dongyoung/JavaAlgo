package programmers.lv1.추억_점수;

import java.util.*;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> m = new HashMap<>();

        for(int i = 0; i < name.length; i++) {
            m.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];

        for(int i = 0; i < photo.length; i++) {
            for(String n : photo[i]) {
                answer[i] += m.getOrDefault(n, 0);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}})));
        System.out.println(Arrays.toString(s.solution(
                new String[]{"kali", "mari", "don"},
                new int[]{11, 1, 55}, new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}})));
        System.out.println(Arrays.toString(s.solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may"},{"kein", "deny", "may"}, {"kon", "coni"}})));

    }
}
