package 牛客网.背包问题.背包问题01背包;

public class Main {
    static int totalweight =150;
    static int N=5;
    static int values[] = {60,20,10,60,100};
    static int weight[] = {20,30,50,60,80};

    public static void main(String[] args){
        System.out.println(bagProblem(N-1,totalweight));
        bag01();
    }

    public static int bagProblem(int i,int j){
        int r=0;
        if(i==-1){
            return 0;
        }
        //如果剩余空间大于所放的物品
        if(j>=weight[i]){
            int r1=bagProblem(i-1,j-weight[i])+values[i]; //放第i件
            int r2 = bagProblem(i-1,j); //不放第i件
            r = Math.max(r1,r2);
        }
        return r;
    }

    //非递归
    public static void bag01(){
        int f[] = new int[totalweight+1];
        for(int f1:f){
            f1=0;
        }
        for (int i=0;i<N;i++){
            int w = weight[i];
            int v = values[i];
            for (int j=totalweight;j>=w;j--){
                f[j] = Math.max(f[j],f[j-w]+v);
            }
        }
        System.out.println(f[totalweight]);
    }

}
