package 蓝桥杯.练习系统题目.基础练习;

import java.util.Scanner;

/*
* 字母图形
* 问题描述
利用字母可以组成一些美丽的图形，下面给出了一个例子：

ABCDEFG

BABCDEF

CBABCDE

DCBABCD

EDCBABC

这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。

输入格式
输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
输出格式
输出n行，每个m个字符，为你的图形。
样例输入
5 7
样例输出
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
* */
public class Demo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char str;
        char [][] arr = new char[n][m];
        char[][]partten = new char[26][26];
        for(int i=0;i<n;i++){
            str='A';
            for(int j=i;j<m;j++){
                partten[i][j]=str++;
            }
            str='A';
            for(int j=i-1;j>=0;j--){
                partten[i][j]=++str;
            }

        }


        //输出字符串
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(partten[i][j]);
            }
            System.out.println("");
        }

    }
}




