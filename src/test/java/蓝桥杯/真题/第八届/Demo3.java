package 蓝桥杯.真题.第八届;

import java.math.BigInteger;

public class Demo3 {
    /*public static void main(String[] args) {
        *//*int a=2;
        int b=3;
        int temp=0;


        for (int i=2;i<=123456;i++){
            temp=a*2-b*3;
            b=a*3+2*b;
            a=temp;
        }
        System.out.println(b);*//*

        int N=123456;
        BigInteger x = BigInteger.valueOf(2);
        BigInteger y = BigInteger.valueOf(3);
        for (int i=2;i<=N;i++){
            BigInteger bi1 = x.multiply(BigInteger.valueOf(2)).subtract(y.multiply(BigInteger.valueOf(3)));
            BigInteger bi2 = x.multiply(BigInteger.valueOf(3)).add(y.multiply(BigInteger.valueOf(2)));
            x=bi1;
            y=bi2;
        }
        System.out.println(y);

    }*/

    static BigInteger A=new BigInteger("2");
    static BigInteger B=new BigInteger("3");
    static BigInteger a=new BigInteger("2");
    static BigInteger b=new BigInteger("3");
    static BigInteger ta,tb;
    public static void main(String[] args) {
        //System.out.println(Math.pow(2, 123456));
        for(int i=1;i<=123455;++i) {
            ta=a.multiply(A).subtract(b.multiply(B));
            tb=a.multiply(B).add(b.multiply(A));
            A=ta;
            B=tb;
        }
        System.out.print(A);
        if(B.compareTo(BigInteger.ZERO)>0)
            System.out.print("+");
        System.out.print(B);
        System.out.println("i");
    }

}
