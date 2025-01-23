package programmers.lv1.두_개_뽑아서_더하기;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public Set<Integer> solution(int[] numbers) {
        Set<Integer> result = new TreeSet<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2, 1, 3, 4, 1}));
    }
}
