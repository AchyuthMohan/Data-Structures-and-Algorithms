public class Main {
    public static int lSearch(int nums[], int target, int start, int end) {
        if (start == end) {
            if (nums[start] == target) {
                return start;
            }
            return -1;
        }

        if (nums[start] == target) {
            return start;
        }

        return lSearch(nums, target, start + 1, end);

    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(lSearch(nums, 4, 0, nums.length - 1));
    }
}
