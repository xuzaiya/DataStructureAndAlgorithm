package 蓝桥杯.练习系统题目.算法训练;

import java.util.Scanner;

/*
* 问题描述

样例输入
一个满足题目要求的输入范例。
3 10
样例输出
与上面的样例输入对应的输出。

数据规模和约定
　　输入数据中每一个数的范围。
　　例：结果在int表示时不会溢出。
* */
public class Demo16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(BinomialValue(k,n));

    }
    public static int BinomialValue(int k,int n){
        if(k==0||k==n){
            return 1;
        }
        return BinomialValue(k,n-1)+BinomialValue(k-1,n-1);
    }
}
