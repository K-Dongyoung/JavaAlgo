package programmers.lv1.지폐_접기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Arrays.sort(wallet);
        int max_i = bill[0] >= bill[1] ? 0 : 1;
        while (wallet[0] < bill[(max_i + 1) % 2] || wallet[1] < bill[max_i]) {
            bill[max_i] /= 2;
            max_i = bill[0] >= bill[1] ? 0 : 1;
            answer++;
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{30, 15}, new int[]{26, 17}));
        System.out.println(s.solution(new int[]{50, 50}, new int[]{100, 241}));
    }
}
