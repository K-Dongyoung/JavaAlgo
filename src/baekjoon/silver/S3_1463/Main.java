package baekjoon.silver.S3_1463;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];

        for (int i = 2; i < N + 1; i++) {
            dp[i] = 1 + dp[i - 1];
            if (i % 3 == 0) dp[i] = Math.min(dp[i], 1 + dp[i / 3]);
            if (i % 2 == 0) dp[i] = Math.min(dp[i], 1 + dp[i / 2]);
        }

        System.out.println(dp[N]);
    }
}
