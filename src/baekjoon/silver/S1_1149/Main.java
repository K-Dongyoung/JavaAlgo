package baekjoon.silver.S1_1149;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] h = new int[N][3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        h[0][0] = Integer.parseInt(st.nextToken());
        h[0][1] = Integer.parseInt(st.nextToken());
        h[0][2] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                h[i][j] = Integer.parseInt(st.nextToken()) + Math.min(h[i - 1][(j + 1) % 3], h[i - 1][(j + 2) % 3]);
            }
        }

        System.out.println(Math.min(h[N - 1][0], Math.min(h[N - 1][1], h[N - 1][2])));
    }
}
