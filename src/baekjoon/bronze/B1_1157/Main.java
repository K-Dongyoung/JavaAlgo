package baekjoon.bronze.B1_1157;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toUpperCase().toCharArray();
        int[] countingArr = new int['z' - 'a' + 1];
        for (char c : chars) {
            countingArr[c - 'A']++;
        }

        int max = 0;
        char answer = 0;
        int count = 0;
        for (int c : countingArr) {
            max = Math.max(max, c);
        }

        for (int i = 0; i < countingArr.length; i++) {
            if (max == countingArr[i]) {
                answer = (char) (i + 'A');
                count++;
            }
        }

        System.out.println(count == 1 ? answer : '?');
    }
}
