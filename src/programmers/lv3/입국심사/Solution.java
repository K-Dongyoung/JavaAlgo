package programmers.lv3.입국심사;

public class Solution {
    public long solution(int n, int[] times) {
        int max = 0;
        for (int time : times) {
            max = Math.max(max, time);
        }

        long l = 1, r = (long) n * max;
        long answer = r;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long sum = 0;
            for (int time : times) {
                sum += mid / time;
                if (sum >= n) break;
            }

            if (sum >= n) {
                answer = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(6, new int[]{7, 10}));
    }
}
