package 蓝桥杯.练习系统题目.算法训练;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 问题描述
　　给定一个长度为n的字符串S，还有一个数字L，统计长度大于等于L的出现次数最多的子串（不同的出现可以相交），
如果有多个，输出最长的，如果仍然有多个，输出第一次出现最早的。
输入格式
　　第一行一个数字L。
　　第二行是字符串S。
　　L大于0，且不超过S的长度。
输出格式
　　一行，题目要求的字符串。

　　输入样例1：
　　4
　　bbaabbaaaaa

　　输出样例1：
　　bbaa

　　输入样例2：
　　2
　　bbaabbaaaaa

　　输出样例2：
　　aa
数据规模和约定
　　n<=60
　　S中所有字符都是小写英文字母。
提示
　　枚举所有可能的子串，统计出现次数，找出符合条件的那个
*
* */
public class Demo14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        String str = scan.next();
        int length = str.length();
        Map<String,Integer> map = new HashMap<>();
        int maxValue = 0;
        String maxStr = ""; //出现最大次数的子串
        for (int i=0;i<=length-n;i++){
            for (int j=i+n;j<str.length();j++){
                String string = str.substring(i,j);
                if (map.containsKey(string)){
                    int value = map.get(string);
                    value++;
                    if(value>maxValue){
                        maxValue = value;
                        maxStr = string;
                    }else if( value == maxValue){
                        if (maxStr.length()<string.length()){
                            maxStr = string;
                        }
                    }
                    map.put(string,value);
                }else{
                    map.put(string,0);
                }
            }
        }

        System.out.println(maxStr);



        for (int i=0;i<=length-n;i++){

        }





    }
    public static int getSubStr(String str,int n){

        return 0;
    }
}
