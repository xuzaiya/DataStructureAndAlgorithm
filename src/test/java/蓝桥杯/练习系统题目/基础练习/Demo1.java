package 蓝桥杯.练习系统题目.基础练习;

import java.util.Arrays;
import java.util.Scanner;

/*
* 数组排序
* */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        //直接调用java api
        /*Arrays.sort(a);
        for(int i: a){
            System.out.println(i);
        }*/

        //冒泡排序
        /*a = sort1(a);
        for(int i: a){
            System.out.println(i);
        }*/

        //选择排序
        /*a=sort2(a);
        for(int i: a){
            System.out.println(i);
        }*/

        //插入排序
        a=sort3(a);
        for(int i: a){
            System.out.println(i);
        }


    }

    //冒泡排序
    public static int[] sort1(int[] a) {
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    //选择排序
    public static int[] sort2(int[] a){
        for (int i=0;i<a.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }


        }

        return a;
    }

    //插入排序
    public static int[] sort3(int[] a){
        for (int i=1;i<a.length;i++){
            int temp = a[i];
            int j =i-1;
            while(j>=0&&a[j]>temp){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = temp;
        }

        return  a;
    }


}




