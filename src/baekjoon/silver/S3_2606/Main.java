package baekjoon.silver.S3_2606;

import java.io.*;
import java.util.*;

public class Main {

    static List<List<Integer>> adj;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        adj = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }

        visited = new boolean[n + 1];

        System.out.println(dfs(1) - 1);
    }

    static int dfs(int v) {
        visited[v] = true;
        int count = 1;
        for (int nv : adj.get(v)) {
            if (visited[nv]) continue;
            count += dfs(nv);
        }
        return count;
    }
}
