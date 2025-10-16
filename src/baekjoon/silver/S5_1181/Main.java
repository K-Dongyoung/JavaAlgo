package baekjoon.silver.S5_1181;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Str> strs = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            Str str = new Str(br.readLine());
            if (set.add(str.s)) {
                strs.add(str);
            }
        }

        strs.sort(null);

        StringBuilder sb = new StringBuilder();
        for (Str str : strs) {
            sb.append(str.s).append("\n");
        }

        System.out.println(sb);
    }

    static private class Str implements Comparable<Str> {
        String s;

        Str(String s) {
            this.s = s;
        }

        @Override
        public int compareTo(Str str) {
            if (this.s.length() != str.s.length()) {
                return this.s.length() - str.s.length();
            }
            return this.s.compareTo(str.s);
        }
    }
}
