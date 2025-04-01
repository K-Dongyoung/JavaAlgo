package programmers.lv2.피로도;

import java.util.*;

class Solution {
    static int answer;
    static int[][] d;
    static int t;
    static boolean[] used;
    static List<int[]> orderedList;

    public int solution(int k, int[][] dungeons) {
        d = dungeons;
        t = k;
        used = new boolean[dungeons.length];
        orderedList = new ArrayList<>();
        permutation();
        return answer;
    }

    private static void permutation() {
        if (orderedList.size() == d.length) {
            calculateTheNumberOfDungeons(t);
            return;
        }

        for (int i = 0; i < d.length; i++) {
            if (!used[i]) {
                used[i] = true;
                orderedList.add(d[i]);
                permutation();
                used[i] = false;
                orderedList.remove(orderedList.size() - 1);
            }
        }
    }

    private static void calculateTheNumberOfDungeons(int k) {
        int count = 0;
        for (int[] dungeon : orderedList) {
            if (k < dungeon[0]) break;
            k -= dungeon[1];
            count++;
        }
        answer = Math.max(answer, count);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }

    /*public int solution(int k, int[][] dungeons) {
        int answer = 0;
        Arrays.sort(dungeons, new ArrayComparator());
        for (int[] dungeon : dungeons) {
            System.out.println(Arrays.toString(dungeon));
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (k < dungeons[i][0]) continue;
            if (k < dungeons[i][1]) continue;
            if (k <= 0) break;
            k -= dungeons[i][1];
            answer++;
        }
        return answer;
    }

    static class ArrayComparator implements Comparator<int[]> {
        public int compare(int[] o1, int[] o2) {
            return (o1[0] - o1[1] > o2[0] - o2[1] ? 1 : (o1[0] - o1[1] < o2[0] - o2[1] ? -1 : Integer.compare(o1[0], o2[0]) * -1)) * -1;
        }
    }*/
}
