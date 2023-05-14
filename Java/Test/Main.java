import javax.swing.plaf.nimbus.State;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLength = nums.length;
        int start = 0;
        int flag = 0;
        int end = 0;
        while (end < nums.length) {
            sum = 0;
            for (int i = start; i <= end; i++) {
                sum += nums[i];
            }
            if (sum >= target) {
                flag = 1;
                minLength = Math.min(minLength, end - start + 1);
                start++;
            } else {
                end++;
            }
        }
        if (flag == 0) {
            return 0;
        } else {
            return minLength;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minSubArrayLen(11, new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }));
    }
}
