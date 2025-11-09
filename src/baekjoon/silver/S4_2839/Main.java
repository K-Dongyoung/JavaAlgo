package baekjoon.silver.S4_2839;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int n = N;
        int answer = -1;
        int a = N / 5;
        n %= 5;
        while (n % 3 != 0 && n <= N) {
            n += 5;
            a--;
        }

        if (n > N) {
            n -= 5;
            a++;
        }

        if (n % 3 == 0) {
            answer = a + n / 3;
        }

        System.out.println(answer);
    }
}
