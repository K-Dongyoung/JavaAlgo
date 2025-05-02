package programmers.lv1.덧칠하기;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        for (int i = 1; i < section.length; i++) {
            if (section[i] < start + m) continue;
            start = section[i];
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(8, 4, new int[]{2, 3, 6}));
        System.out.println(s.solution(5, 4, new int[]{1, 3}));
        System.out.println(s.solution(4, 1, new int[]{1, 2, 3, 4}));
    }
}
