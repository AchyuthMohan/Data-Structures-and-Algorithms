public class Main {
    static void merge(int nums[], int start, int end, int mid) {
        int i = start, j = mid + 1, k = 0;
        int temp[] = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= end) {
            temp[k++] = nums[j++];
        }
        for (int l = 0, m = start; l < temp.length; l++, m++) {
            nums[m] = temp[l];
        }
    }

    static void mergeSort(int nums[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);

    }

    public static void main(String[] args) {
        int nums[] = new int[] { 2, 3, 7, 8, 9, 4, 5, 6, 1 };
        mergeSort(nums, 0, nums.length - 1);
        if (nums.length == 0) {
            System.out.println(-1);
        } else if (nums.length == 1) {
            System.out.println(nums[0]);
        } else {
            System.out.println(nums[nums.length - 1] + nums[nums.length - 2]);
        }
    }
}