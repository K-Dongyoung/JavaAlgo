package baekjoon.silver.S2_1012;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

            int[][] farm = new int[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[y][x] = 1;
            }

            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (farm[j][k] == 1) {
                        bfs(j, k, farm);
                        count++;
                    }
                }
            }

            result.append(count).append("\n");
        }
        System.out.println(result);
    }

    static void bfs(int r, int c, int[][] farm) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        Deque<Integer> q = new ArrayDeque<>();

        farm[r][c] = 2;
        q.offer(r); q.offer(c);

        while (!q.isEmpty()) {
            int cr = q.poll();
            int cc = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];
                if (nr < 0 || farm.length <= nr) continue;
                if (nc < 0 || farm[0].length <= nc) continue;
                if (farm[nr][nc] == 1) {
                    farm[nr][nc] = 2;
                    q.offer(nr);
                    q.offer(nc);
                }
            }
        }
    }
}
