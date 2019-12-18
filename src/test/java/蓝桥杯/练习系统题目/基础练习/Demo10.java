package 蓝桥杯.练习系统题目.基础练习;

import java.util.Scanner;

/*
* 问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。

输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。

输出格式
　　输出n行，每行为输入对应的八进制正整数。

　　【注意】
　　输入的十六进制数不会有前导0，比如012A。
　　输出的八进制数也不能有前导0。

样例输入
　　2
　　39
　　123ABC

样例输出
　　71
　　4435274
* */
public class Demo10 {
    //定义常量字符串数组
    static String[] bin = { "0000", "0001", "0010", "0011", "0100", "0101",
            "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101",
            "1110", "1111" };
    static  String[] oct = { "0", "1", "2", "3", "4", "5", "6", "7" };

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        String [] str = new String[n];
        for (int i=0;i<n;i++){
            str[i] = scan.next();
        }

        for (int i=0;i<n;i++){

            String result = hexToBin(str[i]).toString(); 	//十六进制转换成二进制
            String octResult = binToOct(result); 			//二进制转换成八进制
            if(octResult.startsWith("0")) {
                octResult = octResult.substring(1);
                //substring(int beginIndex)返回一个新的字符串，它是此字符串的一个子字符串。
                //该子字符串从指定索引处的字符开始，直到此字符串末尾。
            }
            if(octResult.startsWith("0")) {
                octResult = octResult.substring(1);
            }
            System.out.println(octResult);

        }


    }

    public static StringBuffer hexToBin(String str){
        int length = str.length();
        int start = 0;
        int end = 1;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++) {
            /*
             * substring(int beginIndex,int endIndex)返回一个新字符串，它是此字符串的一个子字符串。
             *  该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。
             *   因此，该子字符串的长度为 endIndex-beginIndex。
             */
            String subStr = str.substring(start, end); //抽取一个十六进制字符
            start++;
            end++;
            String s = transform(subStr); 				//将抽取的十六进制字符转换成二进制字符
            result.append(s);
        }
        return result;

    }




    //将抽取的十六进制字符转换成二进制字符
    private static String transform(String str) {
        String result = "";
        switch (str) {
            case "0": result = bin[0]; break;
            case "1": result = bin[1]; break;
            case "2": result = bin[2]; break;
            case "3": result = bin[3]; break;
            case "4": result = bin[4]; break;
            case "5": result = bin[5]; break;
            case "6": result = bin[6]; break;
            case "7": result = bin[7]; break;
            case "8": result = bin[8]; break;
            case "9": result = bin[9]; break;
            case "A": result = bin[10]; break;
            case "B": result = bin[11]; break;
            case "C": result = bin[12]; break;
            case "D": result = bin[13]; break;
            case "E": result = bin[14]; break;
            case "F": result = bin[15]; break;
            default: break;
        }
        return result;
    }

    //二进制转换成八进制
    private static String binToOct(String str) {
        int length = str.length();
        /*
         * 二进制字符串的长度不是3的整数倍的时候，就要在字符串的前面补上相应个数的 ‘0’
         * 来让二进制字符串的长度变成3的整数倍
         */
        if(length % 3 == 1) {
            str= "00"+str;
        } else if(length % 3 == 2) {
            str = "0"+str;
        }

        int start = 0;
        int end = 3;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length()/3; i++) {
            String subStr = str.substring(start, end); //抽取三个二进制字符
            start += 3;
            end += 3;
            String s = transform2(subStr); //将抽取的二进制字符串转换成八进制字符
            sb.append(s);
        }
        return sb.toString();
    }


    //将抽取的二进制字符串转换成八进制字符
    private static String transform2(String str) {
        String result = "";
        switch (str) {
            case "000": result = oct[0]; break;
            case "001": result = oct[1]; break;
            case "010": result = oct[2]; break;
            case "011": result = oct[3]; break;
            case "100": result = oct[4]; break;
            case "101": result = oct[5]; break;
            case "110": result = oct[6]; break;
            case "111": result = oct[7]; break;
        }
        return result;
    }


}
