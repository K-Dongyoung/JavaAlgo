package baekjoon.silver.S5_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[1_000_001];
        int[] b = new int[1_000_001];
        for (int i = 0; i < N; i++) {
            int c = Integer.parseInt(br.readLine());
            if (c < 0) {
                a[-c] += 1;
            } else {
                b[c] += 1;
            }
        }
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] == 1) {
                System.out.println(-i);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
