package baekjoon.silver.S5_2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int answer = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '=' || c == '-') answer--;
            if (c == 'd' && i + 2 < s.length() && s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') answer--;
            if (c == 'j' && i - 1 >= 0 && (s.charAt(i - 1) == 'l' || s.charAt(i - 1) == 'n')) answer--;
        }

        System.out.println(answer);
    }
}
