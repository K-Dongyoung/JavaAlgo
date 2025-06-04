package programmers.lv2.방문_길이;

import java.util.*;

public class Solution {
    public int solution(String dirs) {
        Set<A> visited = new HashSet<>();
        int x = 0, y = 0;
        int answer = 0;

        for (char dir : dirs.toCharArray()) {
            A a = new A();
            a.add(x, y);

            x = switch (dir) {
                case 'R' -> Math.min(5, x + 1);
                case 'L' -> Math.max(-5, x - 1);
                default -> x;
            };
            y = switch (dir) {
                case 'U' -> Math.min(5, y + 1);
                case 'D' -> Math.max(-5, y - 1);
                default -> y;
            };

            a.add(x, y);
            if (visited.add(a)) answer++;
        }

        return answer;
    }

    static class A {
        private final Set<Integer> x = new HashSet<>();
        private final Set<Integer> y = new HashSet<>();

        void add(int x, int y) {
            this.x.add(x);
            this.y.add(y);
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return Objects.equals(x, a.x) && Objects.equals(y, a.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ULURRDLLU"));
        System.out.println(s.solution("LULLLLLLU"));
        System.out.println(s.solution("LRLRLR"));
    }
}
