package programmers.lv2.점프와_순간_이동;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n > 0) {
            if (n % 2 == 0) {
                n /= 2;
                continue;
            }
            n -= 1;
            ans += 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5));
        System.out.println(s.solution(6));
        System.out.println(s.solution(5000));
        System.out.println(Integer.toBinaryString(5000));
    }
}
