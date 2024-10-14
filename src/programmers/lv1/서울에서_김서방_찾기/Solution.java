package programmers.lv1.서울에서_김서방_찾기;

public class Solution {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution(new String[]{"Jane", "Kim"});
        System.out.println("solution1 = " + solution1);
    }
}
