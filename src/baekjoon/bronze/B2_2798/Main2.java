package baekjoon.bronze.B2_2798;

import java.io.*;
import java.util.*;

public class Main2 {

    static int N;
    static int M;
    static int[] numbers;

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

        System.out.println(f(3, 0, 0));
    }

    private static int f(int k, int start, int sum) {
        if (sum > M) return 0;

        if (k <= 0) return sum;

        int max = 0;
        for (int i = start; i < N; i++) {
            int c = f(k - 1, i + 1, sum + numbers[i]);
            max = Math.max(max, c);
            if (max == M) break;
        }

        return max;
    }
}
