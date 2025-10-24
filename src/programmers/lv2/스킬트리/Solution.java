package programmers.lv2.스킬트리;

public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int[] charCount = new int['z' - 'a' + 1];
        for (int i = 0; i < skill.length(); i++) {
            charCount[skill.charAt(i) - 'A']++;
        }

        int answer = 0;
        for (String skillTree : skill_trees) {
            int idx = 0;
            boolean flag = true;
            for (int i = 0; i < skillTree.length(); i++) {
                char s = skillTree.charAt(i);
                if (charCount[s - 'A'] != 1) continue;
                if (s != skill.charAt(idx)) {
                    flag = false;
                    break;
                }
                idx++;
            }
            if (flag) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
