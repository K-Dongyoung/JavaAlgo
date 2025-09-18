package baekjoon.silver.S4_10866;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] deque = new int[n];
        int head = 0, tail = 0, size = 0;

        for (int i = 0; i < n; i++) {
            String order = br.readLine();

            if (order.startsWith("push_front")) {
                head = (head - 1 + n) % n;
                deque[head] = Integer.parseInt(order.substring(11));
                size++;
            } else if (order.startsWith("push_back")) {
                deque[tail] = Integer.parseInt(order.substring(10));
                tail = (tail + 1) % n;
                size++;
            } else if (order.equals("pop_front")) {
                if (size == 0) sb.append(-1).append("\n");
                else {
                    sb.append(deque[head]).append("\n");
                    head = (head + 1) % n;
                    size--;
                }
            } else if (order.equals("pop_back")) {
                if (size == 0) sb.append(-1).append("\n");
                else {
                    tail = (tail - 1 + n) % n;
                    sb.append(deque[tail]).append("\n");
                    size--;
                }
            } else if (order.equals("size")) {
                sb.append(size).append("\n");
            } else if (order.equals("empty")) {
                sb.append(size == 0 ? 1 : 0).append("\n");
            } else if (order.equals("front")) {
                sb.append(size == 0 ? -1 : deque[head]).append("\n");
            } else if (order.equals("back")) {
                sb.append(size == 0 ? -1 : deque[(tail - 1 + n) % n]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
