package programmers.lv1.최대공약수와_최소공배수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for(int a = Integer.min(n, m); a >= 1; a--) {
            if (n % a == 0 && m % a ==0) {
                answer[0] = a;
                break;
            }
        }
        int max = Integer.max(n, m);
        for(int a = max; ; a += max) {
            System.out.println(a);
            if (a % n == 0 && a % m == 0) {
                answer[1] = a;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = s.solution(3, 12);
        System.out.println("a = " + Arrays.toString(a));
        int[] b = s.solution(17, 19);
        System.out.println("b = " + Arrays.toString(b));
    }
}
