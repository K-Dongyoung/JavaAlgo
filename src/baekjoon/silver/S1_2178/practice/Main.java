package baekjoon.silver.S1_2178.practice;

import java.util.*;
import java.io.*;

public class Main {

    static int[][] maze;
    static int[][] visited;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = a.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(visited[N - 1][M - 1]);
    }

    static void bfs(int r, int c) {

        int[] rv = new int[]{0, 1, 0, -1};
        int[] cv = new int[]{1, 0, -1, 0};

        Deque<Integer> q = new ArrayDeque<>();
        q.offer(r);
        q.offer(c);
        visited[r][c] = 1;

        while (!q.isEmpty()) {
            int cr = q.poll();
            int cc = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = cr + rv[i];
                int nc = cc + cv[i];

                if (nr < 0 || N <= nr) continue;
                if (nc < 0 || M <= nc) continue;
                if (maze[nr][nc] == 0) continue;
                if (visited[nr][nc] > 0) continue;

                visited[nr][nc] = visited[cr][cc] + 1;
                q.offer(nr);
                q.offer(nc);
            }
        }
    }
}
