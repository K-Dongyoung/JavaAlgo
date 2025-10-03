package programmers.lv2.k진수에서_소수_개수_구하기;

import java.util.*;

public class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        Deque<Integer> s = new ArrayDeque<>();

        while(n > 0) {
            s.push(n % k);
            n /= k;
        }

        long a = 0;
        while (!s.isEmpty()) {
            if (s.peek() != 0) {
                a *= 10;
                a += s.pop();
                if (s.isEmpty() || s.peek() == 0) {
                    answer = isPrime(a) ? answer + 1 : answer;
                    a = 0;
                }
            } else {
                s.pop();
            }
        }
        if (a > 0) answer = isPrime(a) ? answer + 1 : answer;
        return answer;
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(437674, 3));
        System.out.println(s.solution(110011, 10));
        System.out.println(s.solution(1000000, 3));
    }
}
