package programmers.lv3.단어_변환;

public class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean isTargetInWords = false;
        for (String word : words) {
            if (target.equals(word)) {
                isTargetInWords = true;
                break;
            }
        }
        if (!isTargetInWords) return 0;

        boolean[] visited = new boolean[words.length];

        int answer = dfs(begin, target, words, visited, 0);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    static int dfs(String b, String t, String[] w, boolean[] v, int count) {
        if (b.equals(t)) return count;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < w.length; i++) {
            if (v[i]) continue;
            if (isChangeable(b, w[i])) {
                v[i] = true;
                min = Math.min(dfs(w[i], t, w, v, count + 1), min);
                v[i] = false;
            }
        }
        return min;
    }

    static boolean isChangeable(String a, String b) {
        if (a.length() != b.length()) return false;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) count++;
            if (count > 1) return false;
        }

        return count == 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
        System.out.println(s.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}));
    }
}
