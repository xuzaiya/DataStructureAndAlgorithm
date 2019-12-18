package 蓝桥杯.练习系统题目.算法训练;

import java.util.Scanner;

/*
* 问题描述
　　（图３.１－１）示出了一个数字三角形。 请编一个程序计算从顶至底的某处的一条路
　　径，使该路径所经过的数字的总和最大。
　　●每一步可沿左斜线向下或右斜线向下走；
　　●1＜三角形行数≤100；
　　●三角形中的数字为整数0，1，…99；


　　.
　　（图３.１－１）
输入格式
　　文件中首先读到的是三角形的行数。

　　接下来描述整个三角形
输出格式
　　最大总和（整数）
样例输入
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
样例输出
30
* */
public class Demo13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]a = new int[n+1][((1+n)*n)/2+1];

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=i-1 ; j++){
                a[i-1][j]+= Math.max(a[i][j], a[i][j+1]);
            }
        }
        System.out.println(a[1][1]);


    }
}
