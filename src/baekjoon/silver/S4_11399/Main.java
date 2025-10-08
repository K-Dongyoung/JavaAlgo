package baekjoon.silver.S4_11399;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] t = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            t[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(t);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += t[i] * (N - i);
        }

        System.out.println(sum);
    }
}
