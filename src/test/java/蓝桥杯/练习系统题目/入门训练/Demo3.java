package 蓝桥杯.练习系统题目.入门训练;

import java.math.BigInteger;
import java.util.Scanner;

//入门训练 序列求和
public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();


        System.out.println(getSum(n));


    }
    public static long  getSum(long n){

        return n*(n+1)/2;

    }
}
