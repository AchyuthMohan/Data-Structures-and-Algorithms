public class Main {
    public static int maxSubArray(int nums[],int k){
        int maxValue=nums[0]+nums[1]+nums[2];
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(i>=k-1){
                maxValue=Math.min(maxValue,currentSum);
                currentSum-=nums[i-(k-1)];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{4,2,3,4,5,6,7,8,9,1,2,3,4}, 3));
    }
}
