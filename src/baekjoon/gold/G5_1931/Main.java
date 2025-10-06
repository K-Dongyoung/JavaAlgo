package baekjoon.gold.G5_1931;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Meeting[] meetings = new Meeting[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            meetings[i] = new Meeting(s, e);
        }

        Arrays.sort(meetings);

        int count = 0;
        int e = 0;
        for (Meeting m : meetings) {
            if (m.start >= e) {
                count++;
                e = m.end;
            }
        }

        System.out.println(count);

    }

    private static class Meeting implements Comparable<Meeting> {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting m) {
            return this.end != m.end ?
                    Integer.compare(this.end, m.end) :
                    Integer.compare(this.start, m.start);
        }
    }
}
