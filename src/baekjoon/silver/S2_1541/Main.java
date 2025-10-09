package baekjoon.silver.S2_1541;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("-");
        int sum = 0;
        for (String s : a[0].split("\\+")) {
            sum += Integer.parseInt(s);
        }
        for (int i = 1; i < a.length; i++) {
            for (String s : a[i].split("\\+")) {
                sum -= Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}
