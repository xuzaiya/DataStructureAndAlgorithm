package 蓝桥杯.练习系统题目.基础练习;
/*
* 问题描述
　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
* */
public class Demo4 {
    public static void main(String[] args) {
        int ge,shi,bai;
        for (int i=100;i<=999;i++){
            ge=i%10;
            shi = i/10%10;
            bai = i/100;
            if(i==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
                System.out.println(i);
            }
        }
    }
}
