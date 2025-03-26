package baekjoon.silver.S1_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 다른 사람 코드 참고 - visited 안쓴 것, PriorityQueue
public class Main2 {
    static int N;
    static boolean[][] map;
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};
    static Queue<Integer> result = new PriorityQueue<>();

    private static int dfs(int y, int x) {
        map[y][x] = false;
        int count = 1;
        for(int i = 0; i < dy.length; i++) {
            int ny = y + dy[i], nx = x + dx[i];
            if (ny < 0 || nx < 0 || N <= ny || N <= nx) continue;
            if (!map[ny][nx]) continue;
            count += dfs(ny, nx);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j) == '1';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!map[i][j]) continue;
                result.offer(dfs(i, j));
            }
        }

        System.out.println(result.size());
        while (!result.isEmpty()) {
            System.out.println(result.poll());
        }
    }
}
