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
            switch (order) {
                case "push" -> {
                    if (st.hasMoreTokens()) {
                        queue[++back] = Integer.parseInt(st.nextToken());
                    } else {
                        System.out.println("push only integer number");
                    }
                }
                case "pop" -> System.out.println(front == back ? -1 : queue[++front]);
                case "size" -> System.out.println(back - front);
                case "empty" -> System.out.println(front == back ? 1 : 0);
                case "front" -> System.out.println(front == back ? -1 : queue[front + 1]);
                case "back" -> System.out.println(front == back ? -1 : queue[back]);
            }
        }
    }
}
