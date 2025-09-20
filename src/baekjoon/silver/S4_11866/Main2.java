package baekjoon.silver.S4_11866;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder("<");
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) q.addLast(i);

        while (!q.isEmpty()) {
            for (int i = 0; i < K - 1; i++) q.addLast(q.removeFirst());
            sb.append(q.removeFirst()).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.println(sb);
    }
}
