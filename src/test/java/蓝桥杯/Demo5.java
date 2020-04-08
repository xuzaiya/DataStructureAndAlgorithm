package 蓝桥杯;
/*
* 匪警请拨110,即使手机欠费也可拨通！
为了保障社会秩序，保护人民群众生命财产安全，警察叔叔需要与罪犯斗智斗勇，因而需要经常性地进行体力训练和智力训练！


某批警察叔叔正在进行智力训练：
1 2 3 4 5 6 7 8 9 = 110


请看上边的算式，为了使等式成立，需要在数字间填入加号或者减号（可以不填，但不能填入其它符号）。之间没有填入符号的数字组合成一个数，例如：12+34+56+7-8+9 就是一种合格的填法；123+4+5+67-89 是另一个可能的答案。


请你利用计算机的优势，帮助警察叔叔快速找到所有答案。
每个答案占一行。形如：
12+34+56+7-8+9
123+4+5+67-89
......

* */
public class Demo5 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        f(a,8,"",110);
    }

    //a参加运算的元素
    //k：目前考虑的下标
    //so:结果串
    //total:计算目标
    public static void f(int[]a,int k,String so,int total){
        if(k == 0){
            if(a[0] == total){
                System.out.println(a[0]+so);
            }
            return ;
        }
        f(a,k-1,"+"+a[k]+so,total-a[k]);
        f(a,k-1,"-"+a[k]+so,total+a[k]);
        int  old = a[k-1];
        a[k-1] = Integer.parseInt(""+a[k-1]+a[k]);
        f(a,k-1,so,total);
        a[k-1] = old;
    }
}
