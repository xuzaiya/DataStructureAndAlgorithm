package 蓝桥杯.练习系统题目.算法提高;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 问题描述
　　设计算法，用户输入合数，程序输出若个素数的乘积。例如，输入6，输出2*3。输入20，输出2*2*5。
样例
　　与上面的样例输入对应的输出。
　　例：


数据规模和约定
　　输入数据中每一个数在int表示范围内。
* */
public class Demo4 {
       static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        getAllFactor(n);

        for (String str : list){
            System.out.print(str);
        }
        //System.out.println(list.toString());

    }

    public static void getAllFactor(int n){
        int i=2;
        while(n>1){
            if(n%i == 0){
                list.add(i+"");
                n = n/i;
                i=2;
                if(n>1)
                    list.add("*");
            }else{
                i++;
            }


        }


    }
}
