package baekjoon.bronze.B2_10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] a = new int['z' - 'a' + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = -1;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            a[s.charAt(i) - 'a'] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
