package programmers.lv1.옹알이2;

public class Solution4 {
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
                isEqual = true;
                for (int i = 0; i < word.length(); i++) {
                    if (idx + i == s.length() || word.charAt(i) != s.charAt(idx + i)) {
                        isEqual = false;
                        break;
                    }
                }
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
        Solution4 s = new Solution4();
        System.out.println(s.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(s.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
