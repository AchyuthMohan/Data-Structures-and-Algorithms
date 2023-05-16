import java.util.*;

public class Main {
    static void count(List<List<Integer>> res, List<Integer> current, int nums[], int target, int index) {
        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        } else if (target < 0 || index == nums.length) {
            return;
        } else {
            current.add(nums[index]);
            count(res, current, nums, target - nums[index], index);
            current.remove(current.size() - 1);
            count(res, current, nums, target, index + 1);
        }

    }

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int nums[] = new int[] { 1, 2, 3 };
        count(res, current, nums, 9, 0);
        System.out.println(res.size());
    }
}
