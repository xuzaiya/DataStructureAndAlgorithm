package 蓝桥杯;
/*
* 求出栈次序
* */
public class Demo4 {
    public static void main(String[] args) {
//        for (int i=1;i<17;i++){
//            System.out.println(i+" :"+g(i));
//        }
        g(3);

    }

    public static int g(int n){
        return f(n,0);
    }

    //a:等待进栈数目
    //b:栈中的个数
    public static int f(int a,int b){
        if(a == 0)return 1;
        if(b == 0)return f(a-1,1);
        return f(a-1,b+1)+f(a+1,b-1);
    }
}
