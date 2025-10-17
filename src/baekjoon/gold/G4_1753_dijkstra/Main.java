package baekjoon.gold.G4_1753_dijkstra;

import java.io.*;
import java.util.*;

public class Main {

    static int V;
    static int E;
    static int K;
    static List<List<Node>> adj;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        adj = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj.get(u).add(new Node(v, w));
        }

        d(K);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) sb.append("INF\n");
            else sb.append(dist[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void d(int s) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        dist[s] = 0;

        while (!pq.isEmpty()) {
            Node cv = pq.poll();

            if (dist[cv.n] < cv.w) continue;

            for (Node nv : adj.get(cv.n)) {
                int newCost = cv.w + nv.w;
                if (newCost < dist[nv.n]) {
                    dist[nv.n] = newCost;
                    pq.offer(new Node(nv.n, newCost));
                }
            }
        }
    }

    static class Node implements Comparable<Node> {
        int n;
        int w;

        Node(int n, int w) {
            this.n = n;
            this.w = w;
        }

        @Override
        public int compareTo(Node node) {
            return this.w - node.w;
        }
    }
}
