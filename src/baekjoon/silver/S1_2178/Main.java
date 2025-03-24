package baekjoon.silver.S1_2178;

import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;
    static int[][] visited;

    private static void bfs(int y, int x) {
        List<Integer> yv = List.of(0, 1, 0, -1);
        List<Integer> xv = List.of(1, 0, -1, 0);

        Deque<int[]> q = new ArrayDeque<>();

        visited[y][x] = 1;
        q.offer(new int[]{y, x});

        while (!q.isEmpty()) {
            int[] cp = q.poll();
            int cy = cp[0], cx = cp[1];
            for (int i = 0; i < yv.size(); i++) {
                int ny = cy + yv.get(i), nx = cx + xv.get(i);
                if (ny < 0 || map.length <= ny) continue;
                if (nx < 0 || map[0].length <= nx) continue;
                if (visited[ny][nx] > 0) continue;
                if (map[ny][nx] == 0) continue;

                visited[ny][nx] = visited[cy][cx] + 1;
                q.offer(new int[]{ny, nx});
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String m = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = m.charAt(j) - '0';
            }
        }

        visited = new int[N][M];
        bfs(0, 0);
        System.out.println(visited[N - 1][M - 1]);
    }
}
