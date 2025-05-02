package programmers.lv1.과일_장수;

class Solution {
    public int solution(int k, int m, int[] score) {
        if (score.length < m) return 0;

        int[] cnt = new int[k + 1];
        for (int s : score) {
            cnt[s]++;
        }

        int answer = 0;
        int i = k;
        while (0 < i) {
            int a = m;
            while (0 < i && 0 < a) {
                if (a < cnt[i]) {
                    answer += i * m;
                    cnt[i] -= a;
                    a = 0;
                } else if (a == cnt[i]) {
                    answer += i * m;
                    cnt[i--] = 0;
                    a = 0;
                } else {
                    a -= cnt[i];
                    cnt[i--] = 0;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
