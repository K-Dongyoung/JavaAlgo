package baekjoon.silver.S5_1316;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            char c = 'A';
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                char ci = s.charAt(j);
                if (c != ci) {
                    c = ci;
                    if (!set.add(ci)) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(N - count);
    }
}
