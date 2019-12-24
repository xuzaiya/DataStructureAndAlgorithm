package 动态规划;

import java.util.Scanner;

/*
* 将一堆正整数分为2组，要求2组的和相差最小。
例如：1 2 3 4 5，将1 2 4分为1组，3 5分为1组，
两组和相差1，是所有方案中相差最少的。
* */
public class Demo9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0, max = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
            sum += nums[i];
        }
        int[] dp = new int[(int) (sum / 2 + 1)];
        for (int i = 0; i < n; i++) {
            for (int j = (int) (sum / 2); j > 0; j--) {
                if (j >= nums[i]) {
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                }
            }

        }
        for (int i = 1; i < sum / 2 + 1; i++) {
            max = max > dp[i] ? max : dp[i];
        }
        System.out.println(Math.abs((sum - max) - max));
    }
}
