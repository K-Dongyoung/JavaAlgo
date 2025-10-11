package baekjoon.silver.S1_1932;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] t = new int[n][];

        for (int i = 0; i < n; i++) {
            t[i] = new int[i + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = n - 1; i > 0 ; i--) {
            for (int j = 0; j < t[i].length - 1; j++) {
                t[i - 1][j] += Math.max(t[i][j], t[i][j + 1]);
            }
        }

        System.out.println(t[0][0]);
    }
}
