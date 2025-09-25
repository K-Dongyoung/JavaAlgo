package baekjoon.silver.S2_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(height(trees, M));
    }

    static int height(int[] trees, int M) {
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