package baekjoon.silver.S1_2667;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String[][] map;
    static int[][] visited;
    static List<Integer> result = new ArrayList<>();


    private static void bfs(Point p) {
        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};
        Deque<Point> q = new ArrayDeque<>();
        visited[p.y][p.x] = 1;
        int count = 1;
        q.offer(p);
        while (!q.isEmpty()) {
            Point cp = q.poll();
            int y = cp.y, x = cp.x;
            for (int i = 0; i < dy.length; i++) {
                int ny = y + dy[i], nx = x + dx[i];
                if (ny < 0 || N <= ny) continue;
                if (nx < 0 || N <= nx) continue;
                if(map[ny][nx].equals("0")) continue;
                if (visited[ny][nx] > 0) continue;
                visited[ny][nx] = 1;
                count++;
                q.offer(new Point(ny, nx));
            }
        }
        result.add(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new String[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().split("");
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j].equals("0")) continue;
                if (visited[i][j] > 0) continue;
                bfs(new Point(i, j));
            }
        }
        result.sort(null);
        System.out.println(result.size());
        for (Integer c : result) {
            System.out.println(c);
        }
    }

    static class Point {
        private int y, x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
