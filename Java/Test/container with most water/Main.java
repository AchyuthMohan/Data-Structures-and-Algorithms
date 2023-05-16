class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int maxArea = Integer.MIN_VALUE;
        int end = height.length - 1;

        while (start < end) {
            int cLength = (end - start);
            int currentArea = cLength * Math.min(height[start], height[end]);
            maxArea = Math.max(currentArea, maxArea);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxArea(new int[] { 1, 2, 1 }));
    }
}
