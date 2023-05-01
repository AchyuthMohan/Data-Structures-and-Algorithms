import java.util.*;
public class WithoutParam {
    public static ArrayList<Integer> Lsearch(int nums[], int index, int end, int target) {
        ArrayList<Integer>res=new ArrayList<>();
        if (index > end) {
            return res;
        }
        if (nums[index] == target) {
            res.add(index);
        }
        ArrayList<Integer>belowCalls=Lsearch(nums, index + 1, end, target);
        res.addAll(belowCalls);
        return res;

    }
    public static void main(String[] args) {
        int nums[]=new int[]{1,2,3,4,4,5,5,5,5,6};
        System.out.println(Lsearch(nums, 0, nums.length-1, 5));
    }
}
