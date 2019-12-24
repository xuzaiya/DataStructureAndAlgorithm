package 动态规划;

import java.util.Scanner;

/*
 * 背包问题
 * 在N件物品取出若干件放在容量为W的背包里，每件物品的体积为W1，W2……Wn（Wi为整数），
 * 与之相对应的价值为P1,P2……Pn（Pi为整数）。求背包能够容纳的最大价值。
 *
 * */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //n件物品
        int v = scan.nextInt(); //容量为v

        int[] dp = new int[v + 1];
        int[] price = new int[n + 1];
        int[] weight = new int[n + 1];

        long max = 0;

        for (int i = 1; i < n + 1; i++) {
            weight[i] = scan.nextInt();
            price[i] = scan.nextInt();
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = v; j > 0; j--) {
                if (j - weight[i] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - weight[i]] + price[i]);
                } else {
                    dp[j] = dp[i];
                }
            }
        }

        for (int i = 0; i < v + 1; i++) {
            max = max > dp[i] ? max : dp[i];
        }
        System.out.println(max);

    }
}
