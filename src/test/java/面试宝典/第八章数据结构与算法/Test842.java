package 面试宝典.第八章数据结构与算法;
/*
* 如何判断一个数是不是为2 的n次方
* */
public class Test842 {
    public static void main(String[] args) {
        System.out.println(isPower(4));
        System.out.println(isPower(6));
        System.out.println(isPower2(4));
        System.out.println(isPower2(6));


    }
    public static boolean isPower(int n){
        if(n<1)return false;
        int i=1;
        while(i<=n){
            if(i==n)
                return true;
            i<<=1;
        }
        return false;
    }

    //效率更高的算法
    public static boolean isPower2(int n){
        if(n<1)return false;
        int m =n&(n-1);
        return m==0;
    }
}
