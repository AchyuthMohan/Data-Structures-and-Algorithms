import java.util.*;

class Solution {
    static void backtrack(int coins[], int amount, List<Integer> res) {
        for (int i = 0; i < coins.length; i++) {
            if ((amount - coins[i]) >= 0 ) {
                res.add(coins[i]);
                System.out.println(res);
                backtrack(coins, amount - coins[i], res);
                amount+=res.remove(res.size()-1);
                
            } 
        }
        
    }

    public int coinChange(int[] coins, int amount) {
        List<Integer> res = new ArrayList<>();

        Arrays.sort(coins);
        for (int i = 0, j = coins.length - 1; i < coins.length / 2; i++, j--) {
            int temp = coins[i];
            coins[i] = coins[j];
            coins[j] = temp;
        }

        backtrack(coins, amount, res);
        int sum = 0;
        for (int num : res) {
            sum += num;
        }
        System.out.println("Summed: " + sum);
        if (sum != amount) {
            return -1;
        }
        return res.size();
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int coins[] = new int[] { 2, 7, 5, 3, 9, 8, 6, 24 };
        int x = s.coinChange(coins, 19);
        System.out.println(x);
    }
}