package baekjoon.silver.S4_11047;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]), K = Integer.parseInt(split[1]);
        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[N - 1 - i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += K / coins[i];
            K %= coins[i];
        }

        System.out.println(answer);
    }
}
