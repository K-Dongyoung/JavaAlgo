package programmers.나머지가_1이_되는_수_찾기;

public class Solution {

    public int solution(int n) {
        for (int i = 1; i < n - 1; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return n - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(10) = " + solution.solution(10));
        System.out.println("solution.solution(12) = " + solution.solution(12));
    }
}
