package baekjoon.silver.S2_11724;

import java.util.*;

public class Main {

    static List<List<Integer>> adj;
    static boolean[] visited;
    static int answer;

    static void dfs(int v) {
        visited[v] = true;
        for(int n : adj.get(v)) {
            if (!visited[n]) {
                dfs(n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), M = scanner.nextInt();

        adj = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            int s = scanner.nextInt(), e = scanner.nextInt();
            adj.get(s).add(e);
            adj.get(e).add(s);
        }

        visited = new boolean[N + 1];
        for(int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        System.out.println(answer);
    }
}
