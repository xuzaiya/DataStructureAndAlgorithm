package 蓝桥杯;
//打印1-10  不能用循环
public class Demo {
    public static void main(String[] args) {
        g(1,10);
    }

    public static void f(int a,int b){
        for (int i=a;i<=b;i++){
            System.out.println(i);
        }
    }

    public static void g(int a,int b){
        if(b>=a){
            g(a,b-1);
        }
        System.out.println(b);
    }
}
