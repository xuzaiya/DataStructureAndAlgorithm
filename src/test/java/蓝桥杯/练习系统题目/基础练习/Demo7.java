package 蓝桥杯.练习系统题目.基础练习;

import java.util.Scanner;

/*
* 问题描述
给出n个数，找出这n个数的最大值，最小值，和。

输入格式
第一行为整数n，表示数的个数。

第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。

输出格式
输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
样例输入
5
1 3 -2 4 5
样例输出
5
-2
11
* */
public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum =0;
        int max= 0;
        int min = 0;
        int n = scan.nextInt();
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            sum+=arr[i];
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min= arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);


    }
}
