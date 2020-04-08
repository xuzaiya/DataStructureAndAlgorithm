package 蓝桥杯.真题.第七届;
/*
* 搭积木

小明最近喜欢搭数字积木，
一共有10块积木，每个积木上有一个数字，0~9。

搭积木规则：
每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
最后搭成4层的金字塔形，必须用完所有的积木。

下面是两种合格的搭法：

   0
  1 2
 3 4 5
6 7 8 9

   0
  3 1
 7 5 2
9 8 6 4

请你计算这样的搭法一共有多少种？

请填表示总数目的数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
* */
public class Demo3 {
    private static int count = 0;
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i=0;i<10;i++){
            a[i]=0;
        }
        fun(a,0);
        System.out.println(count);
    }
    public static void fun(int[]a,int n){
        if(n == 10){
            count++;
            return ;
        }else{
            for (int i=0;i<=9;i++){
                a[n]=i;
                if(check(a,n))fun(a,n+1);
            }
        }
    }
    public static boolean check(int a[],int i){
        boolean flag = true;
        int h = Hang(i);
        if(i!=0){
            for (int j=0;j<i;j++){
                if(a[i] == a[j]){
                    flag = false;
                    break;
                }
            }
            if(i!=1 && i!=3 &&i!=6&&a[i]<a[i-h%4-1]){
                flag = false;
            }
            if(i!=2&& i!=5&&i!=9&&a[i]<a[i-h]){
                flag= false;
            }
        }
        return  flag;
    }

    public static int Hang(int i){
        int h=0;
        if(i>=1&&i<=2)h=1;
        if(i>=3&&i<=5)h=2;
        if(i>=6&&i<=9)h=3;
        return h;
    }
}
