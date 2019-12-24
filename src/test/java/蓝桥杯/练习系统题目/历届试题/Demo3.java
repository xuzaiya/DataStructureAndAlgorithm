package 蓝桥杯.练习系统题目.历届试题;

import java.util.Scanner;

/*
* 问题描述
100 可以表示为带分数的形式：100 = 3 + 69258 / 714。

还可以表示为：100 = 82 + 3546 / 197。

注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。

类似这样的带分数，100 有 11 种表示法。

输入格式
从标准输入读入一个正整数N (N<1000*1000)

输出格式
程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。

注意：不要求输出每个表示，只统计有多少表示法！

样例输入1
100
样例输出1
11
样例输入2
105
样例输出2
6

* */
public class Demo3 {
    public static int count = 0;
    public static int N,len;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int[] A = {1,2,3,4,5,6,7,8,9};
        String number = N + "";
        len = number.length();
        dfs(A, 0);
        System.out.println(count);

    }

    public static void swap(int[] arrayA, int i, int j) {
        int temp = arrayA[i];
        arrayA[i] = arrayA[j];
        arrayA[j] = temp;
    }

    public static void dfs(int[] arrayA, int step) {
        if(step == arrayA.length) {
            check(arrayA);
            return;
        } else {
            for(int i = step;i < arrayA.length;i++) {
                swap(arrayA, i, step);
                dfs(arrayA, step + 1);
                swap(arrayA, i, step);
            }
        }
    }

    public static void check(int[] A) {
        for(int j = 1;j <= len;j++) {
            int a = A[0];
            for(int i = 1;i < j;i++) {
                a = a * 10;
                a = a + A[i];
            }
            if(a >= N)
                break;
            for(int k = (9 + j) / 2;k < 9;k++) {
                int b = A[j];
                for(int i = j + 1;i < k;i++) {
                    b = b * 10;
                    b = b + A[i];
                }
                int c = A[k];
                for(int i = k + 1;i < 9;i++) {
                    c = c * 10;
                    c = c + A[i];
                }
                if(a * c + b == N * c)
                    count++;
            }
        }
    }

}
