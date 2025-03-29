package programmers.lv1._2016년;

public class Solution {
    public String solution(int a, int b) {
        int[] daysOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int days = b;
        for (int i = 1; i < a; i++) {
            days += daysOfMonth[i];
        }
        return dayOfTheWeek[days % 7];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 24));
    }
}
