package programmers.lv1.옹알이2;

// replace랑 예외처리 때문에 성능 안좋음
public class Solution3 {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String s : babbling) {
            for (int i = 0; i < words.length; i++) {
                s = s.replace(words[i], "" + (i + 1));
            }
            if (f(s)) answer++;
        }
        return answer;
    }

    private boolean f(String s) {
        try {
            Integer.valueOf(s);
        } catch (Exception e) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(s.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
