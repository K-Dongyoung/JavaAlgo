package programmers.lv1.소수_만들기;

class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer++;
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{1,2,3,4}));
        System.out.println(s.solution(new int[]{1,2,7,6,4}));
    }
}
