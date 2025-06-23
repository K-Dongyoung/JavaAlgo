package programmers.lv1.실패율;

import java.util.Arrays;

// gpt 교정. double 직접 비교는 부정확 할 수 있음
public class Solution2 {
    public int[] solution(int N, int[] stages) {
        int[] playersAtEachStage = new int[N + 2];
        int[] answer = new int[N];
        Stage[] stageInfo = new Stage[N];
        int players = stages.length;

        for (int stage : stages) {
            playersAtEachStage[stage]++;
        }

        for (int i = 1; i < N + 1; i++) {
            double fail = players == 0 ? 0 : (double) playersAtEachStage[i] / players;
            stageInfo[i - 1] = new Stage(i, fail);
            players -= playersAtEachStage[i];
        }

        Arrays.sort(stageInfo);
        for (int i = 0; i < N; i++) {
            answer[i] = stageInfo[i].stage;
        }

        return answer;
    }

    static class Stage implements Comparable<Stage>{
        int stage;
        double f_degree;

        Stage(int stage, double f_degree) {
            this.stage = stage;
            this.f_degree = f_degree;
        }

        @Override
        public int compareTo(Stage o) {
            return Double.compare(o.f_degree, this.f_degree);
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(s.solution(4, new int[]{4, 4, 4, 4, 4})));
    }
}
