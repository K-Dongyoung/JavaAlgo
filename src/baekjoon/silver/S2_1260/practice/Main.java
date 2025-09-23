package baekjoon.silver.S2_1260.practice;

import java.io.*;
import java.util.*;

public class Main {

    static List<List<Integer>> adj;
    static int[] visited;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }

        for (List<Integer> a : adj) {
            a.sort(null);
        }

        visited = new int[N + 1];
        dfs2(V);
        result.append("\n");

        visited = new int[N + 1];
        bfs2(V);

        System.out.println(result);
    }

    static void dfs(int v) {
        visited[v] = 1;
        result.append(v).append(" ");
        for (int nv : adj.get(v)) {
            if (visited[nv] == 1) continue;
            dfs(nv);
        }
    }

    static void dfs2(int v) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(v);

        while (!stack.isEmpty()){
            int cv = stack.pop();

            if (visited[cv] == 1) continue;
            visited[cv] = 1;
            result.append(cv).append(" ");

            List<Integer> integers = adj.get(cv);
            for (int i = integers.size() - 1; i >= 0; i--) {
                if (visited[integers.get(i)] == 0) {
                    stack.push(integers.get(i));
                }
            }
        }
    }

    static void bfs(int v) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(v);
        visited[v] = 1;

        while (!q.isEmpty()) {
            int cv = q.poll();
            result.append(cv).append(" ");
            for (int nv : adj.get(cv)) {
                if (visited[nv] > 0) continue;
                visited[nv] = visited[cv] + 1;
                q.offer(nv);
            }
        }
    }

    static void bfs2(int v) {
        Deque<Integer> q = new ArrayDeque<>();
        result.append(v).append(" ");
        visited[v] = 1;
        q.offer(v);

        while (!q.isEmpty()) {
            int cv = q.poll();
            for (int nv : adj.get(cv)) {
                if (visited[nv] > 0) continue;
                result.append(nv).append(" ");
                visited[nv] = visited[cv] + 1;
                q.offer(nv);
            }
        }
    }
}

/*
7 6 1
1 2
2 3
2 4
3 5
4 6
4 7
*/