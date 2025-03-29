package baekjoon.bronze.B3_24267;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long count = 0;
        for (long i = 1; i <= n - 2; i++) {
            count += i * (i + 1) / 2;
        }
        System.out.println(count);
        System.out.println(3);
    }
}

/*
1 - 5 ~ 1
2 - 4 ~ 1
3 - 3 ~ 1
4 - 2 ~ 1
5 - 1
15 + 10 + 6 + 3 + 1
*/