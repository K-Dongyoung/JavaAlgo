package baekjoon.bronze.B2_2798;

import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[] numbers;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        numbers = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        f(3, 0, 0);

        System.out.println(answer);
    }

    private static void f(int k, int start, int sum) {
        if (sum > M) return;

        if (k <= 0) {
            answer = Math.max(answer, sum);
            return;
        }

        for (int i = start; i < N; i++) {
            f(k - 1, i + 1, sum + numbers[i]);
        }
    }
}
