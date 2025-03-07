package programmers.lv1.카드_뭉치;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0, i2 = 0;
        for(String w : goal) {
            if (i1 < cards1.length && w.equals(cards1[i1])) {
                i1++;
                continue;
            }
            if (i2 < cards2.length && w.equals(cards2[i2])) {
                i2++;
                continue;
            }
            return "No";
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(s.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}
