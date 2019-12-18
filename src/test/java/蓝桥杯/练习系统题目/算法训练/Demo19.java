package 蓝桥杯.练习系统题目.算法训练;


import java.util.Scanner;

/*
* 问题描述
　　编写一函数lcm，求两个正整数的最小公倍数。
样例输入
一个满足题目要求的输入范例。
例：

3 5
样例输出
与上面的样例输入对应的输出。
* */
public class Demo19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        System.out.println(m*n/divisor(m,n));


    }

    public static int divisor(int a,int b){
        if(a%b == 0){
            return b;
        }else{
            return divisor(b,a%b);
        }
    }

}
