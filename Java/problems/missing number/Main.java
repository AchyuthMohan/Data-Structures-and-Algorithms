import java.util.*;

public class Main {
    static int missingNumber(int[] nums) {
        if(nums.length==1){
            if(nums[0]!=0){
                return 0;
            }
        }
        int n=nums.length;
        int actual=(n*(n+1))/2;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return actual-sum;
    }
    public static void main(String[] args) {
        int nums[]=new int[]{1};
        System.out.println(missingNumber(nums));
    }
}
