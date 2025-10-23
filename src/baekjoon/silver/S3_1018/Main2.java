package baekjoon.silver.S3_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// gpt가 알려준 누적합 방법
public class Main2 {

    static int rectSum(int[][] ps, int x1, int y1, int x2, int y2) {
        return ps[x2][y2] - ps[x1][y2] - ps[x2][y1] + ps[x1][y1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int[][] misB = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                boolean isB = board[i][j] == 'B';
                boolean isEven = (i + j) % 2 == 0;
                misB[i][j] = (isB == isEven) ? 0 : 1;
            }
        }

        int[][] prefixSum = new int[N + 1][M + 1];
        for (int i = 1; i < N + 1; i++) {
            int rowSum = 0;
            for (int j = 1; j < M + 1; j++) {
                rowSum += misB[i - 1][j - 1];
                prefixSum[i][j] = prefixSum[i - 1][j] + rowSum;
            }
        }

        int min = 64;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = rectSum(prefixSum, i, j, i + 8, j + 8);
                count = Math.min(count, 64 - count);
                min = Math.min(min, count);
            }
        }

        System.out.println(min);
    }
}
