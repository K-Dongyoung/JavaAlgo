package programmers.lv1.비밀지도;

import java.util.Arrays;

public class Solution {
    public String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String b = Integer.toBinaryString(arr1[i] | arr2[i]);
            b = "0".repeat(n - b.length()) + b;
            StringBuilder sb = new StringBuilder();
            for(char c : b.toCharArray()) {
                sb.append((c == '1') ? "#" : " ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }

    public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = n - 1; j >= 0; j--) {
                if (arr1[i] < Math.pow(2, j) && arr2[i] < Math.pow(2, j)) {
                    sb.append(" ");
                    continue;
                }
                if(arr1[i] >= Math.pow(2, j)) {
                    arr1[i] -= Math.pow(2, j);
                }
                if(arr2[i] >= Math.pow(2, j)) {
                    arr2[i] -= Math.pow(2, j);
                }
                sb.append("#");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution1(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(s.solution1(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10})));
    }
}
