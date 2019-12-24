package 蓝桥杯.练习系统题目.算法提高;

import java.util.Scanner;

/*
* 问题描述
Ciel有一个N*N的矩阵，每个格子里都有一个整数。

N是一个奇数，设X = (N+1)/2。Ciel每次都可以做这样的一次操作：他从矩阵选出一个X*X的子矩阵，并将这个子矩阵中的所有整数都乘以-1。

现在问你经过一些操作之后，矩阵中所有数的和最大可以为多少。

输入格式
第一行为一个正整数N。

接下来N行每行有N个整数，表示初始矩阵中的数字。每个数的绝对值不超过1000。

输出格式
输出一个整数，表示操作后矩阵中所有数之和的最大值。
样例输入
3
-1 -1 1
-1 1 -1
1 -1 -1
样例输出
9
数据规模与约定
1 <= N <= 33，且N为奇数。
* */
public class Demo1 {

    public static int N, X;
    public static int[][] Ciel;
    public static int ans = Integer.MIN_VALUE;  //最终结果,初始化为最小

    public static void main(String[] args) {
        Demo1 test = new Demo1();
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        X = (N + 1) / 2;
        Ciel = new int[N][N];
        for(int i = 0;i < N;i++)
            for(int j = 0;j < N;j++)
                Ciel[i][j] = in.nextInt();
        test.getResult();
        System.out.println(ans);

    }


    public void getResult() {
        for(int t = 0;t < (1<<X-1);t++) {
            for(int j = 0;j < X - 1;j++) {
                if((t&(1<<j)) != 0) {
                    for(int i = 0;i < X;i++) {
                        Ciel[i][j] *= -1;
                        Ciel[i][j + X] *= -1;
                    }
                }
            }
            getTempMax();
            for(int j = 0;j < X - 1;j++) {
                if((t&(1<<j)) != 0) {
                    for(int i = 0;i < X;i++) {
                        Ciel[i][j] *= -1;
                        Ciel[i][j + X] *= -1;
                    }
                }
            }
        }
    }


    public void getTempMax() {
        int max = 0;
        int tempA ,tempB;
        for(int j = 0;j < N;j++)
            max += Ciel[X - 1][j];
        for(int i = 0;i < X - 1;i++) {
            tempA = Integer.MIN_VALUE;
            tempB = Ciel[i][X - 1] + Ciel[i + X][X - 1];
            for(int j = 0;j < X - 1;j++)
                tempB += Math.abs(Ciel[i][j]+Ciel[i][j+X]+Ciel[i+X][j]+Ciel[i+X][j+X]);
            tempA = Math.max(tempA, tempB);
            tempB = -1 * (Ciel[i][X - 1] + Ciel[i + X][X - 1]);
            for(int j = 0;j < X - 1;j++)
                tempB += Math.abs((-1)*Ciel[i][j]+Ciel[i][j+X]+(-1)*Ciel[i+X][j]+Ciel[i+X][j+X]);
            tempA = Math.max(tempA, tempB);
            max += tempA;
        }
        ans = Math.max(max, ans);
    }



}
