public class Main {
    public static void insertionSort(int nums[],int n){
        for(int i=1;i<n;i++){
            int j=i-1;
            int current=nums[i];
            while(j>=0 && nums[j]>=current){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
        }
    }
    public static void main(String[] args) {
        int nums[]=new int[]{2,1,3,5,4,6,9,8,7};
        int n=nums.length;
        insertionSort(nums, n);
        for(int val:nums){
            System.out.println(val);
        }
    }
}
