import java.util.*;

public class Main {
    static void backtrack(int nums[], List<List<Integer>> res, List<Integer> current, int index) {
        if (index >= nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtrack(nums, res, current, index + 1);
        current.remove(current.size() - 1);
        backtrack(nums, res, current, index + 1);

    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 4 };
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, res, current, 0);
        System.out.println(res);
    }
}
