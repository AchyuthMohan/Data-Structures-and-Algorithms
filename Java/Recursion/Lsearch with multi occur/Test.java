import java.util.*;

public class Test {
    public static ArrayList<Integer> Lsearch(int nums[], int index, int end, int target, ArrayList<Integer> res) {
        if (index > end) {
            return res;
        }
        if (nums[index] == target) {
            res.add(index);
        }
        return Lsearch(nums, index + 1, end, target, res);

    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 3, 4, 5, 6, 7, 8, 6 };
        ArrayList<Integer> res = new ArrayList<>();
        int n = nums.length;
        System.out.println(Lsearch(nums, 0, n - 1, 6, res));

    }
}
