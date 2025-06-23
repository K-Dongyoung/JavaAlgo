package programmers.lv1.실패율;

import java.util.*;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] a = new int[N + 2];
        int[] b = new int[N + 2];
        int[] answer = new int[N];
        A[] temp = new A[N];
        b[0] = stages.length;

        for (int i = 0; i < stages.length; i++) {
            a[stages[i]]++;
        }

        for (int i = 1; i < N + 1; i++) {
            b[i] = b[i - 1] - a[i - 1];
            temp[i - 1] = new A(i, b[i] != 0 ? (double) a[i] / b[i] : 0);
        }

        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            answer[i] = temp[i].stage;
        }

        return answer;
    }

    static class A implements Comparable<A>{
        int stage;
        double f_degree;

        A(int stage, double f_degree) {
            this.stage = stage;
            this.f_degree = f_degree;
        }

        @Override
        public int compareTo(A o) {
            return this.f_degree > o.f_degree ? -1 : (this.f_degree == o.f_degree ? 0 : 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(s.solution(4, new int[]{4, 4, 4, 4, 4})));
    }
}
