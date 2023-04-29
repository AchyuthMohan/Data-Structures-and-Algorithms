public class Main {
    public static boolean isSorted(int nums[], int start, int end) {
        int i = start;
        if (i == end - 1 && nums[i] < nums[i + 1]) {
            return true;
        } else if (nums[i] < nums[i + 1]) {
            return isSorted(nums, i + 1, end);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 6, 4, 5 };
        System.out.println(isSorted(nums, 0, nums.length - 1));
    }
}
