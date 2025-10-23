package baekjoon.bronze.B2_19532;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] coefficient = new int[6];

        for (int i = 0; i < 6; i++) {
            coefficient[i] = Integer.parseInt(st.nextToken());
        }

        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if (x * coefficient[0] + y * coefficient[1] == coefficient[2] && x * coefficient[3] + y * coefficient[4] == coefficient[5]) {
                    System.out.println(x + " " + y);
                }
            }
        }

    }
}
