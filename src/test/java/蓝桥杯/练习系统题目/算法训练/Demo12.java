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


//答案正确  但是超时了    递归
public class Demo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        //数据已经准备好了，开搞
        int sum = getMaxRoad(arr,0,0);

        System.out.println(sum);
    }

    public static int getMaxRoad(int[][] arr,int i,int j){

        if(i==arr.length-1||j==arr.length-1){
            return arr[i][j];
        }

        return arr[i][j]+Math.max(getMaxRoad(arr,i+1,j),getMaxRoad(arr,i+1,j+1));
    }
}
