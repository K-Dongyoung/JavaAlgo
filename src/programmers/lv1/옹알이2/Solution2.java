package programmers.lv1.옹알이2;

public class Solution2 {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String s : babbling) {
            if (f(words, s, 0, "")) answer++;
        }
        return answer;
    }

    private boolean f(String[] words, String s, int idx, String previous) {
        if (idx == s.length()) return true;
        for (String word : words) {
            if (s.startsWith(word, idx)) {
                if (previous.equals(word)) return false;
                return f(words, s, idx + word.length(), word);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(s.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
