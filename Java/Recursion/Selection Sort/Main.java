public class Main {
    public static void sSort(int nums[], int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (nums[max] < nums[c]) {
                sSort(nums, r, c + 1, c);
            } else {
                sSort(nums, r, c + 1, max);

            }
        } else {
            int temp = nums[max];
            nums[max] = nums[r - 1];
            nums[r - 1] = temp;
            sSort(nums, r - 1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 3, 2, 4, 1, 5, 6, 9, 8, 7 };
        sSort(nums, nums.length, 0, 0);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
