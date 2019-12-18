package 蓝桥杯;
/*
组合重复
* "AABBBC"取3个  有哪些取法
* */
public class Demo10 {
    public static void main(String[] args) {
        int[] data = {2,3,1}; //每个元素的最大个数
        int[] x = new int[data.length];//每个元素取几个

        func(data,x,0,3);
    }

    //data:
    //x:取法
    //k:当前考虑的位置
    //goal:距离目标的剩余名额
    public static void func(int[] data,int[] x,int k,int goal){
        if(k == x.length ){
            if(goal == 0){
                work(x);
                return ;
            }
        }
        for(int i=0;i<=Math.min(data[k],goal);i++){
            x[k] = i;
            func(data,x,k+1,goal-i);

        }
        x[k]=0; //回溯
    }


    static void work(int[] x){
        for (int i=0;i<x.length;i++){
            for (int k=0;k<x[i];k++){
                System.out.print((char)('A'+i));
            }

        }
        System.out.println();
    }
}
