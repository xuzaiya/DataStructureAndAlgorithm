package 动态规划;

import java.util.Scanner;

/*
* 矩阵取数问题
* 一个N*N矩阵中有不同的正整数，经过这个格子，就能获得相应价值的奖励，从左上走到右下，只能向下向右走，求能够获得的最大价值。例如：3 * 3的方格。

1 3 3
2 1 3
2 2 1

能够获得的最大价值为：11。
*
* */
public class Demo4 {
    public static void main(String[] args) {
       /* Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int[][]arr = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] =scan.nextInt();
            }
        }
        //数据已经准备好了*/
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n + 1];
        int[] readMax = new int[n + 1];
        for (int i = 0; i < n; i++) {
            for (int k = 1; k < n + 1; k++) {
                readMax[k] = scan.nextInt();
            }
            for (int j = 1; j < n + 1; j++) {
                dp[j] = Math.max(dp[i], dp[j - 1]) + readMax[j];
            }
        }
        System.out.println(dp[n]);


    }

    private static int getMaxValue(int[][] arr, int i, int j) {
        if (i == arr.length - 1 || j == arr.length - 1) {
            return arr[i][j];
        }

        return arr[i][j] + Math.max(getMaxValue(arr, i + 1, j), getMaxValue(arr, i, j + 1));
    }
}
