package 蓝桥杯;
/*
* 天平称重  递归解法
* 1:1
* 2:3-1
* 3:3
* 4:3+1
* 5:9-3-1
*
*
* 用天平称重时，我们希望用尽可能少的砝码组合称出尽可能多的重量。
如果只有5个砝码，重量分别是1，3，9，27，81
则它们可以组合称出1到121之间任意整数重量（砝码允许放在左右两个盘中）。

本题目要求编程实现：对用户给定的重量，给出砝码组合方案。
*
* */



public class Demo12 {
    public static void main(String[] args) {
        for (int i=1;i<100;i++){
            System.out.println(i+" : "+func(i));
        }
    }

    static String func(int x){
        int a = 1;
        while(a<x) a*=3;
        if(a == x) return ""+a;

        if(x<=a/2) return a/3 +"+"+func(x-a/3);

        return a + reve(func(a-x));

    }

    //正负号变换
    static String reve(String s){
        s = s.replace('-','#');
        s=s.replace('+','-');
        s= s.replace('#','+');
        return "-"+s;
    }



}
