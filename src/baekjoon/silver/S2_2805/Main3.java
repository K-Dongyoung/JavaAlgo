package baekjoon.silver.S2_2805;

import java.io.*;
import java.util.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        int l = 0, r = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            r = Math.max(r, trees[i]);
        }

        int answer = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            long sum = calSum(trees, mid);

            if (sum < M) {
                r = mid - 1;
            } else {
                l = mid + 1;
                answer = Math.max(mid, answer);
            }
        }

        System.out.println(answer);
    }

    static long calSum(int[] trees, int h) {
        long answer = 0;
        for (int tree : trees) {
            answer += Math.max(0, tree - h);
        }
        return answer;
    }
}