package 蓝桥杯;
/*
* 1. 一步之遥
【问题描述】
从昏迷中醒来，小明发现自己被关在X星球的废矿车里。
矿车停在平直的废弃的轨道上。
他的面前是两个按钮，分别写着“F”和“B”。

小明突然记起来，这两个按钮可以控制矿车在轨道上前进和后退。
按F，会前进97米。按B会后退127米。
透过昏暗的灯光，小明看到自己前方1米远正好有个监控探头。
他必须设法使得矿车正好停在摄像头的下方，才有机会争取同伴的援助。
或许，通过多次操作F和B可以办到。

矿车上的动力已经不太足，黄色的警示灯在默默闪烁…
每次进行 F 或 B 操作都会消耗一定的能量。
小明飞快地计算，至少要多少次操作，才能把矿车准确地停在前方1米远的地方。

请填写为了达成目标，最少需要操作的次数。

2.问题分析
　可以看到gcd(97,127)=1，故这是个求解模线性方程组的问题。Ax+By=gcd(A,B).
*
*
*
* */
public class Demo14 {
    public static void main(String[] args) {
        int a = 97,b=127;
        int[] xy = new int [2];
        exGcd(a,b,xy);
        System.out.println(xy[0]+" "+xy[1]);

        //Test843();
    }


    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    static int exGcd(int a ,int b, int [] xy){
        if(b==0){
            xy[0] = 1;
            xy[1] = 0;
            return a;
        }
        int res = exGcd(b,a%b,xy);
        int t = xy[0];
        xy[0]=xy[1];
        xy[1]=t-a/b*xy[0];
        return res;

    }

    public static void Test(){
        for (int x=0;x<100;x++){
            for (int y=0;y<100;y++){
                if(x*97-y*127 == 1){
                    System.out.println("x:"+x+"  "+"y:"+y);
                    break;
                }
            }
        }
    }

}
