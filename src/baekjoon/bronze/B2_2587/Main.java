package baekjoon.bronze.B2_2587;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[5];
        int average = 0;
        for (int i = 0; i < 5; i++) {
            n[i] = Integer.parseInt(br.readLine());
            average += n[i];
        }

        Arrays.sort(n);

        System.out.println(average / 5);
        System.out.println(n[2]);
    }
}
