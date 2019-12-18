package 蓝桥杯.练习系统题目.基础练习;

import java.util.Scanner;

/*
* 问题描述
　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
样例输入
FFFF
样例输出
65535
* */
public class Demo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int length = str.length();
        int sum =0;
        for (int i=0;i<length;i++){
            sum+=transform(str.charAt(i))*Math.pow(16,length-i-1);
        }
        System.out.println(sum);



    }

    public static int transform(char a){
        switch (a){
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'A': return 10;
            case 'B': return 11;
            case 'C': return 12;
            case 'D': return 13;
            case 'E': return 14;
            case 'F': return 15;
            default:
                return 1;

        }
    }
}
