class Solution {
    static int resFind(int nums[],int start,int end){
        int mid=start+(end-start)/2;
        if(nums[start]<nums[end]){
            return nums[start];
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums[mid+1]<nums[mid]){
            return nums[mid+1];
        }
        if(nums[mid]>nums[end]){
            return resFind(nums,mid,end);
        }
        else{
            return resFind(nums,start,mid);
        }
    }
    public static int findMin(int[] nums) {
        return resFind(nums,0,nums.length-1);
    }
}

class Main{
    public static void main(String[] args) {
        Solution s=new Solution();
        int nums[]=new int []{4,5,1,2,3};
        int x=s.findMin(nums);
        System.out.println(x);
    }
}