package 数据结构与算法.正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        //表达式对象
        Pattern pattern = Pattern.compile("\\w+");
        //创建Matcher对象
        Matcher matcher = pattern.matcher("fkdjfkd&&32423");
        //boolean yesornot = matcher.matches();  //尝试将整个字符全序列与该模式匹配
        //该方法扫描输入的序列，查找与该模式匹配的下一个子序列
        //boolean yesornot2 = matcher.find();


       /* System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.find());*/

       while(matcher.find()){
           System.out.println(matcher.group());
       }


    }
}
