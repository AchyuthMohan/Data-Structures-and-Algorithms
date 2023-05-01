class Solution {
    int bsearch(int nums[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[start]<=nums[mid]){
            if(nums[start]<=target && target<=nums[mid]){
                return bsearch(nums,start,mid-1,target);
            }else{
                return bsearch(nums,mid+1,end,target);
            }
        }
        if(target>=nums[mid] && target<=nums[end]){
            return bsearch(nums,mid+1,end,target);
        }
        return bsearch(nums,start,mid-1,target);
    }
    public int search(int[] nums, int target) {
        int res=bsearch(nums,0,nums.length-1,target);
        return res;
    }
}