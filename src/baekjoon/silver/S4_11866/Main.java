package baekjoon.silver.S4_11866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder("<");

        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = i + 1;
        }

        int kCount = 0;
        for (int i = 0, j = 0; j < N; i++) {
            if (n[i % N] == 0) continue;
            if (++kCount == K) {
                sb.append(n[i % N]).append(", ");
                n[i % N] = 0;
                kCount = 0;
                j++;
            }
        }
        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.println(sb);
    }
}
