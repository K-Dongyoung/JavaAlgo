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
    static int[] visited;

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

        visited = new int[N];
        f(0, new int[C], 0);
        System.out.println(sb);
    }

    static void f(int k, int[] temp, int start) {
        if (k == C) {
            sb.append(Arrays.toString(temp)).append("\n");
            return;
        }
        for (int i = start; i < N; i++) {
            if (visited[i] == 0) {
                temp[k] = address[i];
                visited[i] = 1;
                f(k + 1, temp, i + 1);
                visited[i] = 0;
            }
        }
    }
}
