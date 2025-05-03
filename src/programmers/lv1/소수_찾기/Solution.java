package programmers.lv1.소수_찾기;

class Solution {
    public int solution(int n) {
        int[] nums = new int[n + 1];
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (nums[i] == -1) continue;
            answer++;
            for (int j = 2 * i; j <= n; j += i) {
                nums[j] = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(5));
    }
}
