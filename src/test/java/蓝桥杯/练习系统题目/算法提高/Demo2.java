package 蓝桥杯.练习系统题目.算法提高;

import java.util.Scanner;

/*
* 问题描述
　　X市正在进行歌唱比赛，请你写一个程序计算得分。

　　每名选手从1到N编号，每名选手的综合成绩由以下几个部分组成：

　　1.歌唱得分占70%

　　2.才艺展示得分占20%

　　3.观众投票得分占10%

　　4.不超过五分的特殊加分（如果总分超过100分则记为100）
输入格式
　　第一行一个整数N，表示选手人数

　　接下来N行，每行四个整数，分别表示歌唱得分，才艺得分，投票得分和加分。
输出格式
　　输出N行，每行一个数，表示得分（保留一位小数）
样例输入
6
62 50 60 1
77 71 85 3
98 79 98 5
75 62 60 0
99 72 68 4
82 88 89 2
样例输出
60.4
79.6
99.2
70.9
94.5
85.9
数据规模和约定
　　N <= 10000;
* */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][]arr = new int[N][4];
        for (int i=0;i<N;i++){
            //int k=0;
            //double sum = 0;
            for (int j=0;j<4;j++){
                arr[i][j] = scan.nextInt();
            }

            //sum = arr[i][k]*0.7+arr[i][k+1]*0.2+arr[i][k+2]*0.1+arr[i][k+3];
            //System.out.printf("%.1f",sum);

        }

        for (int i=0;i<N;i++){
            int k = 0;
            double sum = 0;
            sum = arr[i][k]*0.7+arr[i][k+1]*0.2+arr[i][k+2]*0.1+arr[i][k+3];;
            System.out.printf("%.1f",sum);
            System.out.println();
        }




    }
}
