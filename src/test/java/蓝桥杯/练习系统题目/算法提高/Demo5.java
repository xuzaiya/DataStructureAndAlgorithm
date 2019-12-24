package 蓝桥杯.练习系统题目.算法提高;

import java.util.Scanner;

/*
* 问题描述
　　有一天，JOE终于不能忍受计算a^b%c这种平凡的运算了。所以他决定要求你写一个程序，计算a^b%c。

　　提示：若b为奇数,，a^b=(a^(b/2))^2*a，否则a^b=(a^(b/2))^2。
输入格式
　　三个非负整数a,b,c；
输出格式
　　一个整数ans，表示a^b%c；
样例输入
7 2 5
样例输出
4
数据规模和约定
　　30% a <= 100, b <= 10^4, 1 <= c <= 100
　　60% a <=10^4, b <= 10^5, 1 <= c <= 10^4
　　100% a <=10^6, b <= 10^9, 1 <= c <= 10^6
* */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(b%2 == 0){
            System.out.println((a^(b/2))^2%c);
        }else{
            System.out.println((a^(b/2))^2*a%c);
        }
    }
}
