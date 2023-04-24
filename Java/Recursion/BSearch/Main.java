public class Main {
    public static int BSearch(int nums[], int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            end = mid - 1;
            
        }
        else{
            start=mid+1;
        }
        return BSearch(nums, start, end, target);
        
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int pos=BSearch(nums,0,6,1);
        System.out.println(pos);
    }
}
