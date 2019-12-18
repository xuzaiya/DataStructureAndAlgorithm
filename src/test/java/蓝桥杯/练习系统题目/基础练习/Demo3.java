package 蓝桥杯.练习系统题目.基础练习;

import java.util.Scanner;

/*
* 四位十进制回文数
*
* */
public class Demo3 {
    public static void main(String[] args) {
        /*int ge,shi,bai,qian ;
        for (int i=1000;i<=9999;i++){
            ge = i%10;
            shi = i/10%10;
            bai = i/100%10;
            qian = i/1000;
            if(ge==qian && shi==bai){
                System.out.println(i);
            }
        }*/

        for (int i=1000;i<=9999;i++){
            if(String.valueOf(i).equals(isHuiWen(String.valueOf(i)))){
                System.out.println(i);
            }
        }


    }

    //判断是不是回文数
    public static String isHuiWen(String str){
        if(str.length() == 1){
            return str;
        }
        return str.charAt(str.length()-1)+isHuiWen(str.substring(0,str.length()-1));

    }

    //判断是不是回文数
}
