package programmers.lv1.부족한_금액_계산하기;

public class Solution {
    public long solution(long price, long money, long count) {
        long totalPrice = price * count * (count + 1) / 2;
        return money < totalPrice ? totalPrice - money : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long solution1 = solution.solution(3, 20, 4);
        System.out.println("solution1 = " + solution1);
    }
}
