public class Main {
    public static void qSort(int nums[],int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];
        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        qSort(nums, low, end);
        qSort(nums, start, high);
    }
    public static void main(String[] args) {
        int nums[]=new int[]{4,1,2,3,8,7,6,5,9};
        qSort(nums, 0, nums.length-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
