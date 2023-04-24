public class Main{
    public static void merge(int nums[],int start,int end,int mid){
        int res[]=new int[end-start+1];
        int i=start,j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                res[k++]=nums[i++];
            }else{
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
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums,start,end,mid);
    }
    public static void main(String[] args) {
        int nums[]=new int[]{2,5,1,3,6,8};
        int n=nums.length;
        mergeSort(nums, 0, n-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}