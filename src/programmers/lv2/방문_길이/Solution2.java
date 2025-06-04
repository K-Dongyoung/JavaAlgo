package programmers.lv2.방문_길이;

import java.util.*;

public class Solution2 {
    public int solution(String dirs) {
        Set<Set<Point>> visited = new HashSet<>();
        int x = 0, y = 0;
        int answer = 0;

        for (char dir : dirs.toCharArray()) {
            int nx = x, ny = y;

            switch (dir) {
                case 'R': nx++; break;
                case 'L': nx--; break;
                case 'U': ny++; break;
                case 'D': ny--; break;
            }

            if (nx < -5 || 5 < nx || ny < -5 || 5 < ny) continue;

            Set<Point> path = new HashSet<>();
            path.add(new Point(x, y));
            path.add(new Point(nx, ny));

            if (visited.add(path)) answer++;

            x = nx;
            y = ny;
        }

        return answer;
    }

    static class Point {
        private final int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("ULURRDLLU"));
        System.out.println(s.solution("LULLLLLLU"));
        System.out.println(s.solution("LRLRLR"));
    }
}
