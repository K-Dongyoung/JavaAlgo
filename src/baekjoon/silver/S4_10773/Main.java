package baekjoon.silver.S4_10773;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] stack = new int[K];
        int top = -1;
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                sum -= stack[top--];
            } else {
                stack[++top] = n;
                sum += n;
            }
        }

        System.out.println(sum);
    }
}
