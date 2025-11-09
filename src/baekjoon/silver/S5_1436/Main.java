package baekjoon.silver.S5_1436;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int i = 666;
        for (; count < N; i++) {
            if (String.valueOf(i).contains("666")) {
                count++;
            }
        }
        System.out.println(--i);
    }
}
