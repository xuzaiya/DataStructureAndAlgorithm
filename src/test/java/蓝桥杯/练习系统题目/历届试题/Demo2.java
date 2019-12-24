package 蓝桥杯.练习系统题目.历届试题;
/*
* 问题描述
小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：

1. 各组的核桃数量必须相同

2. 各组内必须能平分核桃（当然是不能打碎的）

3. 尽量提供满足1,2条件的最小数量（节约闹革命嘛）

输入格式
输入包含三个正整数a, b, c，表示每个组正在加班的人数，用空格分开（a,b,c<30）
输出格式
输出一个正整数，表示每袋核桃的数量。
样例输入1
2 4 5
样例输出1
20
样例输入2
3 1 1
样例输出2
3
* */

import java.util.Map;
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int d = lcm(a,b); //d是a与b的最小公倍数
        int result = lcm(d,c);
        System.out.println(result);



        /*int temp = Math.max(a,b);
        int max;
        if (temp>c){
            max= temp;
        }else{
            max =c;
        }
        for (int i=temp;i<=a*b*c;i++){
            if(i%a ==0 && i%b == 0 && i%c == 0){
                System.out.println(i);
                break;
            }
        }*/


    }

    //求两个数的最大公约数
    private static int gcd(int a,int b){
        int temp ;
        if(a<b){
            //交换两个数，使大数放在a上
            temp=a;
            a=b;
            b=temp;
        }
        while(b!=0){
            //利用辗转相除法，直到b为0位置
            temp= a%b;
            a= b;
            b= temp;
        }
        return a;
    }

    //求两个数的最小公倍数
    private static int lcm(int a,int b){
        int temp_lcm;
        temp_lcm= a*b/gcd(a,b); //最小公倍数等于两个数之积除以最大公约数
        return temp_lcm;
    }
}
