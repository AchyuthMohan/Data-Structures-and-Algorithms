public class Main {
    public static int minSubArray(int target,int nums[]){
        int currentWindowSum=0;
        int minWindowSize=Integer.MAX_VALUE;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            currentWindowSum+=nums[windowEnd];
            while(currentWindowSum>=target){
                minWindowSize=Math.min(minWindowSize,windowEnd-windowStart+1);
                currentWindowSum-=nums[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }
    public static void main(String[] args) {
        int nums[] = new int[] { 2, 3, 4, 7, 6, 5, 8, 9, 10 };
        int target = 8;
        System.out.println(minSubArray(target, nums));
    }
}
