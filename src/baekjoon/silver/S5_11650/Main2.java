package baekjoon.silver.S5_11650;

import java.io.*;
import java.util.*;

// gpt code
public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] a = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken()); // x
            a[i][1] = Integer.parseInt(st.nextToken()); // y
        }
        Arrays.sort(a, (p, q) -> {
            int byX = Integer.compare(p[0], q[0]);
            return byX != 0 ? byX : Integer.compare(p[1], q[1]);
        });
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(a[i][0] + " " + a[i][1]);
            if (i + 1 < N) bw.newLine();
        }
        bw.flush();
    }
}
