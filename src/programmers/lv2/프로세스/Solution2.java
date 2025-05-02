package programmers.lv2.프로세스;

import java.util.Arrays;

// 성능은 Solution 보다 조금 안좋지만 성능 편차는 적음.. 정렬에 시간이 많이 걸리나 봄
public class Solution2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] orderedList = new int[priorities.length];
        System.arraycopy(priorities, 0, orderedList, 0, priorities.length);
        Arrays.sort(orderedList);
        int order = priorities.length - 1;
        for (int i = 0;; i++) {
            int index = i % priorities.length;
            if (priorities[index] == 0) continue;
            if (priorities[index] == orderedList[order]) {
                priorities[index] = 0;
                answer++;
                order--;
                if (index == location) return answer;
            }
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(s.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
        System.out.println(s.solution(new int[]{3, 4, 1, 2, 3, 5, 6, 2, 1, 3, 3, 7, 2}, 4));
    }
}
