package baekjoon.silver.S3_2579;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] s = new int[n + 1];
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = s[1];
        if (n >= 2) {
            dp[2] = s[1] + s[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = s[i] + Math.max(dp[i - 2], s[i - 1] + dp[i - 3]);
        }

        System.out.println(dp[n]);
    }
}
