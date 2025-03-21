package baekjoon.silver.S2_1260;

import java.util.*;

public class Main {

    static List<List<Integer>> adj;
    static boolean[] visited;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), M = scanner.nextInt(), V = scanner.nextInt();

        adj = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            adj.get(s).add(e);
            adj.get(e).add(s);
        }

        for(int i = 0; i <= N; i++) {
            Collections.sort(adj.get(i));
        }

        visited = new boolean[N + 1];
//        dfs(V);
        recursive_dfs(V);

        visited = new boolean[N + 1];
        result.append("\n");
        bfs(V);

        System.out.println(result);
    }

    public static void dfs(int V) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(V);

        while (!stack.isEmpty()) {
            V = stack.peek();
            if (!visited[V]) {
                visited[V] = true;
                result.append(V).append(" ");
            }

            boolean flag = false;
            for(int v : adj.get(V)) {
                if (!visited[v]) {
                    stack.push(v);
                    flag = true;
                    break;
                }
            }

            if (!flag) stack.pop();
        }
    }

    public static void recursive_dfs(int V) {
        if (visited[V]) return;

        visited[V] = true;
        result.append(V).append(" ");
        for(int v : adj.get(V)) {
            if (!visited[v]) {
                recursive_dfs(v);
            }
        }
    }

    public static void bfs(int V) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(V);
        visited[V] = true;
        while (!queue.isEmpty()) {
            V = queue.poll();
            result.append(V).append(" ");
            for (int v : adj.get(V)) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }
}

/*
8 10 1
1 4
1 2
2 3
2 4
3 5
4 5
4 6
5 6
5 8
6 7
*/
