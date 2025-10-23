package baekjoon.silver.S3_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = 64;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {

                int count = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if ((k + l) % 2 == 0 && board[k][l] == 'W') count++;
                        if ((k + l) % 2 == 1 && board[k][l] == 'B') count++;
                    }
                }

                count = Math.min(count, 64 - count);
                min = Math.min(min, count);
            }
        }
        System.out.println(min);
    }
}
