package baekjoon.silver.S4_11399;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] c = new int[1001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            c[Integer.parseInt(st.nextToken())]++;
        }

        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) continue;
            while (c[i]-- > 0) {
                sum += i * N--;
            }
        }

        System.out.println(sum);
    }
}
