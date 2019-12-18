package 蓝桥杯;
/*
* 历届试题 填字母游戏  
时间限制：1.0s   内存限制：256.0MB
   
锦囊1
锦囊2
锦囊3
问题描述

　　小明经常玩 LOL 游戏上瘾，一次他想挑战K大师，不料K大师说：
　　“我们先来玩个空格填字母的游戏，要是你不能赢我，就再别玩LOL了”。


　　K大师在纸上画了一行n个格子，要小明和他交替往其中填入字母。


　　并且：


　　1. 轮到某人填的时候，只能在某个空格中填入L或O
　　2. 谁先让字母组成了“LOL”的字样，谁获胜。
　　3. 如果所有格子都填满了，仍无法组成LOL，则平局。


　　小明试验了几次都输了，他很惭愧，希望你能用计算机帮他解开这个谜。

输入格式

　　第一行，数字n（n<10），表示下面有n个初始局面。
　　接下来，n行，每行一个串，表示开始的局面。
　　比如：“******”, 表示有6个空格。“L****”, 表示左边是一个字母L，它的右边是4个空格。

输出格式

　　要求输出n个数字，表示对每个局面，如果小明先填，当K大师总是用最强着法的时候，小明的最好结果。
　　1 表示能赢
　　-1 表示必输
　　0 表示可以逼平

样例输入

4
***
L**L
L**L***L
L*****L

样例输出

0
-1
1
1

*
* */
public class Demo18 {
    public static void main(String[] args) {
        System.out.println(game("***"));
        System.out.println(game("L**L"));
        System.out.println(game("L**L***L"));
        System.out.println(game("L*****L"));
    }

    static int game(String s){
        return f(s.toCharArray());
    }

    static int f(char[] x){
        String s = new String(x);
        if(s.contains("LOL")) return -1;
        if(s.contains("*") == false) return 0;

        boolean ping = false; //假设无法逼平
        for (int i=0;i<x.length;i++){
            if(x[i]=='*'){
                try{
                    x[i] = 'L'; //试着填入
                    switch(f(x)){
                        case -1:return 1;
                        case 0:ping= true;
                    }
                    x[i] = 'O'; //试着填入O
                    switch (f(x)){
                        case -1: return 1;
                        case 0: ping = true;
                    }

                } finally{
                    x[i]='*';

                }

            }
        }
        if(ping) return 0;
        return -1;


    }
}
