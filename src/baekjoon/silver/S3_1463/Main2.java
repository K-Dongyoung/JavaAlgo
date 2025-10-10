package baekjoon.silver.S3_1463;

import java.io.*;

public class Main2 {

    static int[] memoization;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memoization = new int[N + 1];
        System.out.println(f(N));
    }

    private static int f(int n) {
        if (memoization[n] > 0) return memoization[n];
        if (n == 1) return 0;

        int temp =  f(n - 1);
        if (n % 3 == 0) temp = Math.min(temp, f(n / 3));
        if (n % 2 == 0) temp = Math.min(temp, f(n / 2));
        memoization[n] = 1 + temp;
        return memoization[n];
    }
}
