package 蓝桥杯.练习系统题目.基础练习;

import java.math.BigInteger;

/*
* 用java自带的api
* 实现进制之间的转换
*
* */
public class Demo12 {
    public static void main(String[] args) {
        //十六进制  转换成  十进制
        BigInteger bi = new BigInteger("FFFF",16);
        String result = bi.toString(10);


        // 十六进制   转换成   二进制
        String result2 = bi.toString(2);
        System.out.println(result2);

        //十六进制  转换成  八进制
        String result3 = bi.toString(8);
        System.out.println(result3);

    }

}



/*
public class test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        BigInteger bi = null;
        String enter = null;
        enter = input.next();
        bi = new BigInteger(enter,16);
        String show = bi.toString(10);
        System.out.println(show);
        Integer.valueOf("FFFF",16).toString();
    }
}
*/

