package programmers.lv1.문자열_내_p와_y의_개수;

public class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'p' -> p += 1;
                case 'y' -> y += 1;
            }
        }
        return p == y;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean pPoooyY = solution.solution("pPoooyY");
        System.out.println("pPoooyY = " + pPoooyY);
        boolean pyy = solution.solution("Pyy");
        System.out.println("pyy = " + pyy);
    }
}
