package programmers.lv2.모음_사전;

// 머리가 안돌아가서 노가다 해봄
public class Solution {
    public int solution(String word) {
        String[] chars = {"", "A", "E", "I", "O", "U"};
        return f(chars, word);
    }

    private int f(String[] chars, String word) {
        int answer = 0;
        for (String a : chars) {
            if (a.equals("")) {
                continue;
            }
            for (String b : chars) {
                if (b.equals("")) {
                    answer++;
                    if (word.equals(a)) return answer;
                    continue;
                }
                for (String c : chars) {
                    if (c.equals("")) {
                        answer++;
                        if (word.equals(a + b)) return answer;
                        continue;
                    }
                    for (String d : chars) {
                        if (d.equals("")) {
                            answer++;
                            if (word.equals(a + b + c)) return answer;
                            continue;
                        }
                        for (String e : chars) {
                            if (e.equals("")) {
                                answer++;
                                if (word.equals(a + b + c + d)) return answer;
                                continue;
                            }
                            answer++;
                            if (word.equals(a + b + c + d + e)) return answer;
                        }
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AAAAE"));
        System.out.println(s.solution("AAAE"));
        System.out.println(s.solution("I"));
        System.out.println(s.solution("EIO"));
    }
}
