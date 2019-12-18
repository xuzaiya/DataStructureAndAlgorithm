package 蓝桥杯.练习系统题目.算法训练;

import java.util.Scanner;

/*
* 问题描述
　　给定L,R。统计[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
　　如5的二进制为101，包含2个“1”。
输入格式
　　第一行包含2个数L,R
输出格式
　　一个数S，表示[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
样例输入
2 3
样例输出
3
数据规模和约定
　　L<=R<=100000;
*
* */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int sum= 0;
        for (int i=n;i<=m;i++){
            int index = i;
            while(index>0){
                int temp = index%2;
                if(temp == 1) sum++;
                index= index/2;
            }

        }
        System.out.println(sum);


    }
}
