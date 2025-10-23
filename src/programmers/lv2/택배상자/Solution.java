package programmers.lv2.택배상자;

public class Solution {
    public int solution(int[] order) {
        int[] stack = new int[order.length];
        int top = -1;

        int answer = 0;
        int idx = 0;
        int box = 1;

        while (idx < order.length && top < order.length) {
            if (box == order[idx]) {
                answer++;
                idx++;
                box++;
                continue;
            }

            if (top > -1 && order[idx] == stack[top]) {
                answer++;
                top--;
                idx++;
                continue;
            }

            if (order[idx] < box) {
                break;
            }

            if (order[idx] > box) {
                stack[++top] = box++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{4, 3, 1, 2, 5}));
        System.out.println(s.solution(new int[]{5, 4, 3, 2, 1}));
    }
}
