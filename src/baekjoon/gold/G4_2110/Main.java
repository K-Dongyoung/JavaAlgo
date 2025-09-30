package baekjoon.gold.G4_2110;

import java.io.*;
import java.util.*;

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

        int l = 1, r = address[address.length - 1] - address[0];
        int answer = 0;

        while (l <= r) {
            int mid = (l + r) / 2;
            int cnt = 1;
            int s = 0, e = 1;
            int min_dist = address[address.length - 1] - address[0];
            while (e < N) {
                int dist = address[e] - address[s];
                if (dist >= mid) {
                    min_dist = Math.min(min_dist, dist);
                    s = e;
                    cnt++;
                }
                e++;
            }

            if (cnt < C) {
                r = mid - 1;
            } else {
                l = mid + 1;
                answer = Math.max(min_dist, answer);
            }
        }

        System.out.println(answer);
    }
}
