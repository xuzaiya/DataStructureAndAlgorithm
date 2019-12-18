package 蓝桥杯.练习系统题目.算法训练;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Arrays;
import java.util.Scanner;

/*
* 问题描述
给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。

输入格式
第一行包含一个数n，表示序列长度。

第二行包含n个正整数，表示给定的序列。

第三个包含一个正整数m，表示询问个数。

接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。

输出格式
总共输出m行，每行一个数，表示询问的答案。
样例输入
5
1 2 3 4 5
2
1 5 2
2 3 2
样例输出
4
2
数据规模与约定
对于30%的数据，n,m<=100；

对于100%的数据，n,m<=1000；

保证k<=(r-l+1)，序列中的数<=106
*
* */
public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []arr =new int [n];
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        for (int i=0;i<m;i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            int k = scan.nextInt();
            //输入起始位置，结束位置，指定元素
            int temp[] = new int[end -start +1];
            int index = 0;
            //将指定范围元素复制给新的元素
            for (int j=start-1;j<=end-1;j++){
                temp[index++]=arr[j];
            }
            Arrays.sort(temp);

            int downsort[] = new int[temp.length];
            int index2 = temp.length-1;
            //将排好序的数组按倒序方式赋给下一个新的数组
            for (int j = 0; j < downsort.length; j++) {
                downsort[j]=temp[index2--];
            }
            //输出新数组指定索引位置元素
            System.out.println(downsort[k-1]);


        }



    }
}
