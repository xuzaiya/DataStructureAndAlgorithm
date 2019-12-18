package 蓝桥杯.练习系统题目.算法训练;

import java.util.Scanner;
import java.util.Stack;

/*
* 问题描述
　　输入一个只包含加减乖除和括号的合法表达式，求表达式的值。其中除表示整除。
输入格式
　　输入一行，包含一个表达式。
输出格式
　　输出这个表达式的值。
样例输入
1-2+3*(4-5)
样例输出
-4
数据规模和约定
　　表达式长度不超过100，表达式运算合法且运算过程都在int内进行

* */
public class Demo15 {
    //方法一
    //先将中缀转换为后缀，用后缀计算表达式值
    //使用Arraylist代替栈

    //方法二
    //创建两个堆栈,放符号栈和数字栈
    //分别抽取进行运算
    static Stack<Integer> integers = new Stack<>();
    static Stack<Character> characters = new Stack<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();

        characters.push('#');
        char[] chs=str.toCharArray();
        int num=0;

        //数字
        for(int i=0;i<str.length();i++){
            if(chs[i]>='0'&&chs[i]<='9'){
                num=chs[i]-'0';
                for (i = i + 1; i < str.length(); i++) {
                    if ('0' <= chs[i] && chs[i] <= '9') {
                        num = num * 10 + (chs[i] - '0');
                    } else {
                        i--;
                        break;
                    }
                }
                integers.push(num);
                continue;
            }
            //运算符
            if(chs[i]=='+'||chs[i]=='-'||chs[i]=='*'||chs[i]=='/'){
                while (opCompare(characters.peek(),chs[i])&&integers.size()>1){
                    calc();
                }
                characters.push(chs[i]);
                continue;
            }

            if(chs[i]=='('){
                characters.push(chs[i]);
                continue;
            }

            if(chs[i]==')'){
                while (characters.peek()!='('&&integers.size()>1){
                    calc();
                }
                characters.pop();
            }
        }
        while (integers.size()>1){
            calc();
        }
        System.out.println(integers.get(0));



    }


    /**
     *
     * @param op1 栈顶符号
     * @param op2 入栈符号
     * @return
     */
    public static boolean opCompare(char op1,char op2){
        if(op1=='*'||op1=='/'){
            return true;
        }
        if(op2=='*'||op2=='/'||op1=='('){
            return false;
        }
        return true;
    }



    public static void calc(){
        char op=characters.pop();
        int num2=integers.pop();
        int num1=integers.pop();

        switch (op){
            case '+':
                integers.push(num1+num2);
                break;
            case '-':
                integers.push(num1-num2);
                break;
            case '*':
                integers.push(num1*num2);
                break;
            case '/':
                integers.push(num1/num2);
                break;
            default:break;
        }
    }


}
