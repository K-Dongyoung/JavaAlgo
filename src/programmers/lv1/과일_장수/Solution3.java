package programmers.lv1.과일_장수;

// gpt가 다듬어준 코드
class Solution3 {
    public int solution(int k, int m, int[] score) {
        if (score.length < m) return 0;

        int[] cnt = new int[k + 1];
        for (int s : score) {
            cnt[s]++;
        }

        int answer = 0;
        int remain = 0;
        for (int i = k; i >= 0; i--) {
            remain += cnt[i];
            while (remain >= m) {
                answer += i * m;
                remain -= m;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
