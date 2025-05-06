package programmers.lv1.옹알이2;

public class Solution5 {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String s : babbling) {
            if (f(words, s)) answer++;
        }
        return answer;
    }

    private boolean f(String[] words, String s) {
        int idx = 0;
        String previous = "";
        while (idx < s.length()) {
            boolean isEqual = true;
            for (String word : words) {
                isEqual = s.startsWith(word, idx);
                if (isEqual) {
                    if (word.equals(previous)) return false;
                    idx += word.length();
                    previous = word;
                    break;
                }
            }
            if (!isEqual) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(s.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(s.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
