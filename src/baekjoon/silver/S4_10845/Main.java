package baekjoon.silver.S4_10845;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] queue = new int[n];
        int front = -1, back = -1;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push")) {
                if (st.hasMoreTokens()) {
                    queue[++back] = Integer.parseInt(st.nextToken());
                } else {
                    System.out.println("push only integer number");
                }
            } else if (order.equals("pop")) {
                System.out.println(front == back ? -1 : queue[++front]);
            } else if (order.equals("size")) {
                System.out.println(back - front);
            } else if (order.equals("empty")) {
                System.out.println(front == back ? 1 : 0);
            } else if (order.equals("front")) {
                System.out.println(front == back ? -1 : queue[front + 1]);
            }else if (order.equals("back")) {
                System.out.println(front == back ? -1 : queue[back]);
            }
        }
    }
}
