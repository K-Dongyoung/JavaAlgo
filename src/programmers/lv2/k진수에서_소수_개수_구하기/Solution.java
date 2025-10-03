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
        return answer;
    }

    public int solution2(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % k);
            n /= k;
        }

        String st = sb.reverse().toString();
        String[] split = st.split("0+");
        for (String x : split) {
            if (x.isEmpty()) continue;
            if (isPrime(Long.parseLong(x))) answer++;
        }

        return answer;
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; (long) i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution2(437674, 3));
        System.out.println(s.solution2(110011, 10));
        System.out.println(s.solution2(1000000, 3));
    }
}
