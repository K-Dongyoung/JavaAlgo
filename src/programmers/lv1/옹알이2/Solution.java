package programmers.lv1.옹알이2;

// 내가 봐도 아주 아름답게 풀었다
public class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String s : babbling) {
            if (f(words, s, "")) answer++;
        }
        return answer;
    }

    private boolean f(String[] words, String s, String previous) {
        for (String word : words) {
            if (s.startsWith(word)) {
                if (previous.equals(word)) return false;
                if (s.equals(word)) return true;
                return f(words, s.substring(word.length()), word);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(s.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
