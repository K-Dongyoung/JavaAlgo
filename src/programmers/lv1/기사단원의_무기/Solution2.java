package programmers.lv1.기사단원의_무기;

// 다른 사람 풀이.. 효율이 엄청 좋다..
public class Solution2 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] count = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }

        for (int n : count) {
            answer += n > limit ? power : n;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(5, 3, 2));
        System.out.println(s.solution(10, 3, 2));
    }
}
