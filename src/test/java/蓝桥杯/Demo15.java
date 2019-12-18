package 蓝桥杯;

import java.math.BigInteger;

/*
   有理数
*
*
* */
public class Demo15 {



    private BigInteger zi = BigInteger.ZERO; //分子
    private BigInteger mu = BigInteger.ONE; //分母


    public Demo15(long x){
        this(BigInteger.valueOf(x),BigInteger.ONE);
    }

    public Demo15(BigInteger x){
        this(x,BigInteger.ONE);
    }

    public Demo15(BigInteger x,BigInteger y){
        zi = x;
        mu = y;
        BigInteger g = gcd(zi,mu); //求最大公约数
        zi = zi.divide(g);//分子除以最大公约数
        mu = mu.divide(g);
    }

    public Demo15(long x,long y){
        this(BigInteger.valueOf(x),BigInteger.valueOf(y));
    }


    @Override
    public String toString() {
        String s = zi.toString();
        if (mu.equals(BigInteger.ONE) == false)
            s+="/"+mu;
        return s;

    }



    static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(b.ZERO)) return a;
        return gcd(b,a.mod(b));
    }

    public Demo15 add(Demo15 it){
        return new Demo15(zi.multiply(it.mu).add(mu.multiply(it.zi)),mu.multiply(it.mu));
    }

    public Demo15 mul(Demo15 it){
        return new Demo15(zi.multiply(it.zi),mu.multiply(it.mu));
    }

    public static void main(String[] args) {
        Demo15 sum = new Demo15(0);
        for(int i=1;i<100;i++){
            sum = sum.add(new Demo15(1,i));
        }
        System.out.println(sum);
        System.out.println(new Demo15(34,23));
    }






}
