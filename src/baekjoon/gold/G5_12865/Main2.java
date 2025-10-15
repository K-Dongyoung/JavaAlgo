package baekjoon.gold.G5_12865;

import java.io.*;
import java.util.*;

// 시간 초과
public class Main2 {

    static int N;
    static int K;
    static int[] k;
    static int[] v;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        k = new int[N];
        v = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            k[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        f(0, 0, 0);

        System.out.println(answer);
    }

    static void f(int ck, int cv, int start) {
        if (ck > K) return;
        answer = Math.max(answer, cv);
        for (int i = start; i < N; i++) {
            f(ck + k[i], cv + v[i], i + 1);
        }
    }
}
