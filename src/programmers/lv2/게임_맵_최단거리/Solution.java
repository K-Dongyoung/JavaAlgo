package programmers.lv2.게임_맵_최단거리;

import java.util.*;

public class Solution {
    public int solution(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};
        Deque<Point> q = new ArrayDeque<>();

        Point start = new Point(0, 0);
        q.offer(start);
        while (!q.isEmpty()) {
            Point cp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nr = cp.row + dy[i], nc = cp.column + dx[i];
                if (nr < 0 || n <= nr || nc < 0 || m <= nc) continue;
                if (maps[nr][nc] == 0 || maps[nr][nc] > 1) continue;
                maps[nr][nc] = maps[cp.row][cp.column] + 1;
                if (nr == n - 1 && nc == m - 1) return maps[nr][nc];
                q.offer(new Point(nr, nc));
            }
        }

        return -1;
    }

    static class Point {
        private final int row, column;

        Point(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}}));
        System.out.println(s.solution(new int[][]{{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,0}, {0,0,0,0,1}}));
    }
}
