package 蓝桥杯.练习系统题目.基础练习;

import java.util.Scanner;

/*
* 输入格式
输入包含一个数n。

输出格式
输出杨辉三角形的前n行。每一行从这一行的第一个数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。
* */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr =new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                if(j== 0||i==j)
                {
                    arr[i][j] =1;
                }else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }

                System.out.print(arr[i][j]+"\t");


            }
            System.out.println();
        }



    }
}


/*

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int [][]num = new int[n][n];
		for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
        if(j==0||i==j){
        num[i][j]=1;
        }else{
        num[i][j]=num[i-1][j-1]+num[i-1][j];
        }
        System.out.print(num[i][j]+"\t");


        }
        System.out.println("");*/
