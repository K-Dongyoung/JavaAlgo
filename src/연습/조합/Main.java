package 연습.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] address;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        address = new int[N];
        for (int i = 0; i < N; i++) {
            address[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(address);

        f(0, new int[C], 0);
        System.out.println(sb);
    }

    static void f(int k, int[] temp, int start) {
        if (k == C) {
            sb.append(Arrays.toString(temp)).append("\n");
            return;
        }
        for (int i = start; i < N; i++) {
            temp[k] = address[i];
            f(k + 1, temp, i + 1);
        }
    }
}
/*
5 3
1
2
3
4
5
*/