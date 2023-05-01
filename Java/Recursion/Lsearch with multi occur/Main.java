import java.util.*;

public class Main {
    public static void Lsearch(int nums[], int index, int target, int end, ArrayList<Integer> res) {
        if (index > end) {
            return;
        }
        if (nums[index] == target) {
            res.add(index);
        }
        Lsearch(nums, index + 1, target, end, res);

    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 4, 5, 5, 6, 7, 5 };
        ArrayList<Integer> res = new ArrayList<>();
        int n = nums.length;
        Lsearch(nums, 0, 5, n - 1, res);
        System.out.println(res);
    }
}
