public class Main {
    public static void bSort(int nums[], int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
            bSort(nums, i, j + 1);
        } else {
            bSort(nums, i - 1, 0);
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 2, 4, 3, 1, 5, 8, 7, 9 };
        bSort(nums, nums.length - 1, 0);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
