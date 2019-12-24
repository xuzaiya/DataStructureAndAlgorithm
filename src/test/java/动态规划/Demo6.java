package 动态规划;

import java.util.Scanner;

/*
* 最长递增子序列
* 给出长度为N的数组，找出这个数组的最长递增子序列。
(递增子序列是指，子序列的元素是递增的）
例如：5 1 6 8 2 4 5 10，最长递增子序列是1 2 4 5 10。
* */
public class Demo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        double[] dou = new double[n + 1];
        dou[0] = Integer.MIN_VALUE;
        dou[1] = num[0];
        int Len = 1;
        int p, r, m;
        for (int i = 1; i < n; i++) {
            p = 0;
            r = Len;
            while (p <= r) {
                m = (p + r) / 2;
                if (dou[m] < num[i]) {
                    p = m + 1;
                } else {
                    r = m - 1;
                }
            }
            dou[p] = num[i];
            if (p > Len) {
                Len++;
            }
        }
        System.out.println(Len);
    }
}
