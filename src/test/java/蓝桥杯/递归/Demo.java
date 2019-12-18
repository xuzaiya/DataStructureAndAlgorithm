package 蓝桥杯.递归;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* 求阶乘
* 打印i-j
* 数组求和
* 翻转字符串
* 斐波拉契数列
* 最大公约数
* 排序改递归
* 汉诺塔
*
* */
public class Demo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        //System.out.println(test1(4));
        //test2(1,10);
        //System.out.println(test3(a,0));
        //System.out.println(test4("abcdefg",6));
        //System.out.println(test5(5));
        //System.out.println(test6(4,8));
        int [] b = {3,6,7,2,4,9,5,8};
        test7(b,7);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }


    //求阶乘
    public static int test1(int n){
        //出口
        if(n==1){
            return 1;
        }
        return n*test1(n-1);
    }

    //打印i-j
    public static void test2(int i,int j){
        if(j==i){
            System.out.println(i);
            return ;
        }
        test2(i,j-1);
        System.out.println(j);
    }

    //数组求和
    public static int test3(int[] a,int begin){
        if(begin==a.length){
            return 0;
        }
        return a[begin]+test3(a,begin+1);
        //System.out.println(a[begin]);
    }


    //翻转字符串
    public static String test4(String str,int end){
        if(end == 0){
            return ""+str.charAt(0);
        }
        return str.charAt(end)+test4(str,end-1);
    }

    //斐波拉契数列  输出第n项的数字
    public static int test5(int n){
        if(n==1||n==2){
            return 1;
        }
        return test5(n-1)+test5(n-2);
    }

    //最大公约数
    public static int test6(int m,int n){
        if(n==0)
            return m;

        return test6(n,m%n);
    }

    //排序改递归
    public static void test7(int [] arr,int k){
        if(k==0)return;
        test7(arr,k-1);
        int x = arr[k];
        int index = k-1;
        while(index>-1&&x<arr[index]){
            arr[index+1] = arr[index];
            index--;
        }
    }





}
