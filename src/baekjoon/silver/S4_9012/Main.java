package baekjoon.silver.S4_9012;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) sb.append(isVPS(br.readLine()) ? "YES\n" : "NO\n");

        System.out.println(sb);
    }

    static boolean isVPS(String ps) {
        int count = 0;

        for (int i = 0; i < ps.length(); i++) {
            char c = ps.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) return false;
                count--;
            }
        }

        return count == 0;
    }
}
