package 蓝桥杯.练习系统题目.算法训练;

import java.util.Scanner;

/*
* 问题描述
　　输入正整数n，判断从1到n之中，数字1一共要出现几次。例如1123这个数，则出现了两次1。例如15，那么从1到15之中，一共出现了8个1。
输入格式
　　一个正整数n
输出格式
　　一个整数，表示1出现的资料
样例输入
15
样例输出
8
数据规模和约定
　　n不超过30000
* */
public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            String s = ""+i;
            char[] ch = s.toCharArray();
            for (int j=0;j<ch.length;j++){
                if(ch[j] == '1'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}

