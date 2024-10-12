package programmers.lv1.자연수_뒤집어_배열로_만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution1(long n) {
        List<Long> result = new ArrayList<>();
        while (n > 0) {
            result.add(n % 10);
            n /= 10;
        }
        return result.stream().mapToInt(Long::intValue).toArray();
    }

    public int[] solution2(long n) {
        int a = (int) Math.log10(n) + 1;
        int[] result = new int[a];
        for (int i = 0; i < a; i++) {
            result[i] = (int) (n % 10);
            n /= 10;
        }
        return result;
    }
}
