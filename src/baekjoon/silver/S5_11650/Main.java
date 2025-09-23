package baekjoon.silver.S5_11650;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Coordinate[] c = new Coordinate[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            c[i] = new Coordinate(st.nextToken(), st.nextToken());
        }

        Arrays.sort(c);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            result.append(c[i].x).append(" ").append(c[i].y).append("\n");
        }

        result.delete(result.length() - 1, result.length());
        System.out.println(result);
    }

    static class Coordinate implements Comparable<Coordinate> {
        final int x;
        final int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Coordinate(String x, String y) {
            this.x = Integer.parseInt(x);
            this.y = Integer.parseInt(y);
        }


        @Override
        public int compareTo(Coordinate o) {
            return this.x < o.x ? -1 : (this.x > o.x ? 1 : (Integer.compare(this.y, o.y)));
        }
    }
}
