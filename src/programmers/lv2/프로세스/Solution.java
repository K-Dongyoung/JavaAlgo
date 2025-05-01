package programmers.lv2.프로세스;

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        for (int i = 0;; i++) {
            int index = i % priorities.length;
            if (priorities[index] == 0) continue;
            int max_i = index;
            for (int j = 0; j < priorities.length; j++) {
                if (priorities[max_i] < priorities[j]) {
                    max_i = j;
                }
            }
            if (index == max_i) {
                priorities[index] = 0;
                answer++;
                if (max_i == location) return answer;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(s.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
        System.out.println(s.solution(new int[]{3, 4, 1, 2, 3, 5, 6, 2, 1, 3, 3, 7, 2}, 4));
    }
}
