package programmers.lv1.폰켓몬;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
//    public int solution(int[] nums) {
//        Set<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        return Math.min(s.size(), nums.length / 2);
//    }

    public int solution(int[] nums) { // stream 보다 성능이 나음.
        Set<Integer> s = new HashSet<>();
        for(int i : nums) {
            s.add(i);
        }
        return Math.min(s.size(), nums.length / 2);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3,1,2,3}));
        System.out.println(s.solution(new int[]{3,3,3,2,2,4}));
        System.out.println(s.solution(new int[]{3,3,3,2,2,2}));
    }
}
