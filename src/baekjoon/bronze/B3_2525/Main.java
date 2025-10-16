package baekjoon.bronze.B3_2525;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        h += C / 60;
        m += C % 60;

        if (m >= 60) {
            m -= 60;
            h ++;
        }

        h %= 24;

        System.out.println(h + " " + m);
    }
}
