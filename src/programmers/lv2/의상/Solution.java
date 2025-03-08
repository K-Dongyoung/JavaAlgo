package programmers.lv2.의상;

import java.util.*;

public class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> m = new HashMap<>();
        for(String[] a : clothes) {
            m.put(a[1], m.getOrDefault(a[1], 0) + 1);
        }
        int answer = 1;
        for(String s : m.keySet()) {
            answer *= m.get(s) + 1;
        }
        return answer - 1;
    }
}
