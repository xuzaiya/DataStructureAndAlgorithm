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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[N][N];
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if(arr[i][j]<0){

                    if((i!=0||j!=N-1)&&(arr[i][j]+arr[i][j-1]+arr[i+1][j]+arr[i+1][j-1])<0){
                        arr[i][j]*=-1;
                        arr[i][j-1]*=-1;
                        arr[i+1][j]*=-1;
                        arr[i+1][j-1]*=-1;
                    }

                    if(j==0&&(arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+1][j+1])<0){
                        arr[i][j+1]*=-1;
                        arr[i+1][j]*=-1;
                        arr[i+1][j+1]*=-1;
                        arr[i+1][j+1]*=-1;
                    }


                }
            }
        }
    }

}
