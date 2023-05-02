public class Main {
    public static void selectionSort(int nums[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[small] > nums[j]) {
                    small = j;
                }
            }
            if (small != i) {
                int temp = nums[i];
                nums[i] = nums[small];
                nums[small] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int nums[]=new int[]{2,1,3,4,8,7,5,6};
        int n=nums.length;
        selectionSort(nums, n);for(

    int val:nums)
    {
        System.out.println(val);
    }
