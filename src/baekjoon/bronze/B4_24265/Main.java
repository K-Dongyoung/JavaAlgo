package baekjoon.bronze.B4_24265;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println((n - 1) * n / 2);
        System.out.println(2);
    }
}
