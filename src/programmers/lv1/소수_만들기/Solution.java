package programmers.lv1.소수_만들기;

class Solution {
    public int solution(int[] nums) {
        boolean[] isComposite = new boolean[2998];
        for (int i = 2; i < isComposite.length; i++) {
            if (isComposite[i]) continue;
            for (int j = 2 * i; j < isComposite.length; j += i) {
                isComposite[j] = true;
            }
        }

        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (!isComposite[nums[i] + nums[j] + nums[k]]) answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1,2,3,4}));
        System.out.println(s.solution(new int[]{1,2,7,6,4}));
    }
}
