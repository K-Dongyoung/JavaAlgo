package baekjoon.silver.S2_2805;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(height2(trees, M));
    }

    static long height(int[] trees, int M) {
        Arrays.sort(trees);
        int n = trees.length;
        if (n == 1) return trees[0] - M;
        long[] c = new long[n];
        c[n - 1] = trees[n - 1];
        for (int i = n - 2; i >=0; i--) {
            c[i] = c[i + 1] + trees[i];
        }
        int s = 0, e = n - 1;
        while (s + 1 < e) {
            int idx = (s + e) / 2;
            long H = trees[idx];
            long sum = c[idx + 1] - H * (n - 1 -idx);
            if (sum == M) return H;
            else if (sum > M) {
                s = idx;
            } else if (sum < M) {
                e = idx;
            }
        }

        int c1 = n - s;
        int c2 = c1 - 1;
        long H1 = (c[s] - M) / c1;
        long H2 = (Math.max(0, c[s + 1] - M)) / c2;
        long sum1 = c[s] - H1 * (c1);
        long sum2 = c[s + 1] - H2 * (c2);

        if (sum1 < M) return H2;
        if (sum2 < M) return H1;
        return Math.max(H1, H2);
    }

    static int height2(int[] trees, int M) {
        Arrays.sort(trees);
        int n = trees.length;
        long[] c = new long[n];
        c[n - 1] = trees[n - 1];
        for (int i = n - 2; i >=0; i--) {
            c[i] = c[i + 1] + trees[i];
        }
        int s = 0, e = trees[n - 1];
        int maxH = 0;
        while (s <= e) {
            int H = (s + e) / 2;
            int idx = find_idx(trees, H);
            long sum = (idx < n) ? c[idx] - (long) H * (n - idx) : 0;
            if (sum == M) return H;
            else if (sum < M) {
                e = H - 1;
            } else if (sum > M) {
                maxH = Math.max(maxH, H);
                s = H + 1;
            }
        }
        return maxH;
    }

    static int find_idx(int[] trees, int H) {
        int s = 0, e = trees.length;
        while (s < e) {
            int idx = (s + e) / 2;
            if (trees[idx] <= H) {
                s = idx + 1;
            } else {
                e = idx;
            }
        }
        return s;
    }
}