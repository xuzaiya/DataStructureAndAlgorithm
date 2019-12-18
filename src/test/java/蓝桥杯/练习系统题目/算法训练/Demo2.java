package 蓝桥杯.练习系统题目.算法训练;

import java.util.Scanner;

/*
* 问题描述
　　输出大于等于n的最小的完全平方数。
　　若一个数能表示成某个自然数的平方的形式，则称这个数为完全平方数
　　Tips：注意数据范围
输入格式
　　一个整数n
输出格式
　　大等于n的最小的完全平方数
样例输入
71711
样例输出
71824
数据规模和约定
　　n是32位有符号整数
*
* */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        for (long i=n;i<=n*n;i++){
            for (long j=0;j<=Math.sqrt(i);j++){
                if(j*j ==i ){
                    System.out.println(i);
                    return ;
                }
            }
        }
    }
}
