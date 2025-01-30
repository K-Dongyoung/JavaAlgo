package programmers.lv1.K번째수;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = IntStream.range(commands[i][0] - 1, commands[i][1]).map(index -> array[index]).sorted().toArray()[commands[i][2] - 1];
        }
        return answer;
    }

    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Arrays.stream(array, commands[i][0] - 1, commands[i][1]).sorted().toArray()[commands[i][2] - 1];
        }
        return answer;
    }

    public int[] solution3(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < answer.length; i++) {
            int[] s = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(s);
            answer[i] = s[commands[i][2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
        System.out.println(Arrays.toString(s.solution2(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
        System.out.println(Arrays.toString(s.solution3(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
