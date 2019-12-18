package 蓝桥杯.练习系统题目.入门训练;

import java.util.Scanner;
//斐波拉契数列
public class Demo1 {

    public static void main(String[] args) {
        int[] a = new int[10000001];
        a[1] = 1;
        a[2] = 1;
        int n = new Scanner(System.in).nextInt();
        for (int i=3; i<=n; i++){
            a[i] = (a[i-1]+a[i-2])%10007;
        }
        System.out.println(a[n]);
    }


    public static int Fibola(int n){
        if(n==1||n==2)return 1;
        return Fibola(n-1)+Fibola(n-2);
    }

}
