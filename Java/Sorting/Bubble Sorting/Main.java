public class Main {
    public static void bubbleSort(int nums[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]=new int[]{2,3,4,1,5,6,9,8,7};
        bubbleSort(nums, nums.length);
        for(int val:nums){
            System.out.print(val+" ");
        }
    }
}
