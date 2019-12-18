package 蓝桥杯;

import java.util.List;
import java.util.Vector;

//组合枚举递归法
/*
*
* 在字符串“ABCDE” 中取3个字母一共有几种取法   3是个变量
* */
public class Demo9 {

    public static void main(String[] args) {
        List list = f("ABCDE",3);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static List f(String s ,int n){
        List list = new Vector();
        if (n == 0 ){
            list.add("");
            return list;
        }
        for (int i=0;i<s.length();i++){
            char x = s.charAt(i);
            List t = f(s.substring(i+1),n-1);
            for (int k=0;k<t.size();k++){
                list.add(""+x+t.get(k));
            }
        }
        return list;
    }


}
