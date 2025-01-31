package programmers.lv1.문자열_내_마음대로_정렬하기;

import java.util.Arrays;
import java.util.Comparator;

// solution은 틀렸고 solution2가 맞음. 문제를 잘못 이해함. n 인덱스의 문자가 같으면 그냥 전체 단어를 사전순으로 바로 비교하면 됨.
// 그러므로 "abce", "qbcd"에서 n=2일 때 "abce", "qbcd"로 정렬되는 거임.
// 인덱스 n 이후의 문자만 사전순으로 비교하는 것이 아닌 string 전체임.
public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new customComparator(n));
        return strings;
    }

    public String[] solution2(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            char a1 = a.charAt(n); char b2 = b.charAt(n);
            if (a1 != b2) {
                return (a1 > b2) ? 1 : -1;
            }
            return a.compareTo(b);
        });
        return strings;
    }

    static class customComparator implements Comparator<String> {

        private int index;
        private int currentIndex;

        public customComparator(int index) {
            this.index = index;
            currentIndex = index;
        }

        @Override
        public int compare(String o1, String o2) {
            if(o1.equals(o2)) {
                return 0;
            }
            if (o2.startsWith(o1)) {
                return -1;
            }
            if (o1.startsWith(o2)) {
                return 1;
            }
            if (o1.charAt(currentIndex) != o2.charAt(currentIndex)) {
                currentIndex = index;
                return (o1.charAt(currentIndex) - o2.charAt(currentIndex)) > 0 ? 1 : -1;
            }
            if (o1.charAt(currentIndex) == o2.charAt(currentIndex)) {
                currentIndex++;
                return compare(o1, o2);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution2(new String[]{"sun", "be", "bed"}, 1)));
        System.out.println(Arrays.toString(s.solution2(new String[]{"abce", "qbcd", "cdx"}, 2)));
    }
}
