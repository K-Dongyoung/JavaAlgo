package programmers.lv3.이중우선순위큐;

import java.util.*;

public class Solution {

    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (String o : operations) {
            if (o.startsWith("I")) {
                int key = Integer.parseInt(o.substring(2));
                m.put(key, m.getOrDefault(key, 0) + 1);
                continue;
            }

            if (m.isEmpty()) continue;

            int key;
            if (o.charAt(2) == '1') key = m.lastKey();
            else key = m.firstKey();

            m.put(key, m.get(key) - 1);
            if (m.get(key) == 0) m.remove(key);
        }

        return m.isEmpty() ? new int[]{0, 0} : new int[]{m.lastKey(), m.firstKey()};
    }

    // gpt 도움
    public int[] solution2(String[] operations) {
        Queue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> minpq = new PriorityQueue<>();
        Map<Integer, Integer> m = new HashMap<>();

        for (String o : operations) {
            int n = Integer.parseInt(o.substring(2));
            if (o.startsWith("I")) {
                maxpq.offer(n);
                minpq.offer(n);
                m.put(n, m.getOrDefault(n, 0) + 1);
                continue;
            }

            if (m.isEmpty()) continue;

            int key;
            if (n == 1) {
                clean(maxpq, m);
                key = maxpq.poll();
            }
            else {
                clean(minpq, m);
                key = minpq.poll();
            }
            m.put(key, m.get(key) - 1);

            if (m.get(key) == 0) m.remove(key);
        }

        clean(maxpq, m);
        clean(minpq, m);

        return m.isEmpty() ? new int[]{0, 0} : new int[]{maxpq.peek(), minpq.peek()};
    }

    void clean(Queue<Integer> heap, Map<Integer, Integer> m) {
        while (!heap.isEmpty()) {
            Integer top = heap.peek();
            Integer c = m.get(top);
            if (c == null || c == 0) heap.poll();
            else break;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));
        System.out.println(Arrays.toString(s.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));
        // max -5643 123
        // min 16 123
        // m 123
    }
}
