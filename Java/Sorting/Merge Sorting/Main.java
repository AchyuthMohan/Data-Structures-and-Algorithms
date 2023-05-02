public class Main {
    public static void merge(int nums[],int start,int end,int mid){
        int i=start,j=mid+1,k=0;
        int res[]=new int[end-start+1];
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                res[k++]=nums[i++];
            }
            else{
                res[k++]=nums[j++];
            }
        }
        while(i<=mid){
            res[k++]=nums[i++];
        }
        while(j<=end){
            res[k++]=nums[j++];
        }
        for(int l=0,m=start;l<res.length;l++,m++){
            nums[m]=res[l];
        }
    }
    public static void mergeSort(int nums[],int start,int end){
        if(start>end){
            return;
        }
        int mid=start +(end-start)/2;
        mergeSort(nums, start, mid-1);
        mergeSort(nums, mid+1, end);
        merge(nums, start, end, mid);
    }
    public static void main(String[] args) {
        int nums[]=new int[]{2,3,1,7,6,5,8,9,10};
        mergeSort(nums, 0, nums.length-1);
        for(int val:nums){
            System.out.print(val+" ");
        }
    }
}
