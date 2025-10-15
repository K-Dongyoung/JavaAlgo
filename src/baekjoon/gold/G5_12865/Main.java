package baekjoon.gold.G5_12865;

import java.io.*;
import java.util.*;

// 혼자 풀기 실패
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] k = new int[N + 1];
        int[] v = new int[N + 1];
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            k[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], j >= k[i] ? dp[i - 1][j - k[i]] + v[i] : 0);
            }
        }

        System.out.println(dp[N][K]);
    }
}
