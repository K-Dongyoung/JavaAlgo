package programmers.lv2.타겟_넘버;

class Solution {
    public int solution(int[] numbers, int target) {
        return f(numbers, target, 0, 0);
    }

    private int f(int[] numbers, int target, int i, int sum) {
        if (i == numbers.length) {
            if (sum == target) return 1;
            return 0;
        }
        return f(numbers, target, i + 1, sum + numbers[i]) + f(numbers, target, i + 1, sum - numbers[i]);
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(s.solution(new int[]{4, 1, 2, 1}, 4));
    }
}
