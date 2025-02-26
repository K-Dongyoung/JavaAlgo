package programmers.lv2.구명보트;

import java.util.Arrays;

public class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int i = 0, j = people.length - 1;
        while(i <= j) {
            answer += 1;
            if (people[i] + people[j] <= limit) i++;
            j--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(s.solution(new int[]{70, 80, 50}, 100));
    }
}
