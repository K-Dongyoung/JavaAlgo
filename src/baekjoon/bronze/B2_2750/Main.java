package baekjoon.bronze.B2_2750;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(a[i]).append("\n");
        }

        System.out.println(sb);
    }
}
