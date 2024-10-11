package programmers.lv1.평균_구하기;

public class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        double average = solution.solution(new int[]{1, 2, 3, 4});
        System.out.println("average = " + average);
    }
}
