package 蓝桥杯.练习系统题目.基础练习;

import java.util.Scanner;

/*
* 123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
* */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ge,shi,bai,qian,wan,shiwan;
        for (int i=10000;i<1000000;i++){
             ge = i%10;
             shi = i/10%10;
             bai = i/100%10;
             qian = i/1000%10;
             wan = i/10000%10;
             shiwan = i/100000%10;
            if(shiwan == 0){
                if(ge==wan&& shi == qian&&(ge+shi+bai+qian+wan) ==n){
                    System.out.println(i);
                }
            }else{
                if(ge == shiwan && shi==wan&&bai==qian&&(ge+shi+bai+qian+wan) ==n){
                    System.out.println(i);
                }
            }
        }



    }

    //判断是不是回文字符串
    public static String reserve(String str){
        if(str.length() ==1){
            return str;
        }
       return str.charAt(str.length()-1)+reserve(str.substring(0,str.length()-1));
    }

    //计算每一个相加的和
    public static int sum(int a){
        int sum = 0;
        while(a>0){
            int ge = a%10;
            sum+=ge;
            a=a/10;
        }
        return sum;
    }
}

















