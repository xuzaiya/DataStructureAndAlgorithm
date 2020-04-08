package 蓝桥杯;
/*
* 存储位置备忘
* 规则：
* 每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
最后搭成4层的金字塔形，必须用完所有的积木。


*
*       0
*     1    2
*   3    4   5
* 6   7    8    9
*
* */

//搭积木
public class Demo8 {
    static int N;
    public static void main(String[] args) {
        int [] a = {0,1,2,3,4,5,6,7,8,9};
        f(a,0);
        System.out.println(N);
    }

    //k:当前考虑的位置
    //a:待排的元素
    public static void f(int[] a,int k){
        if(k == a.length-1){
            test(a);
            return ;
        }

        for (int i=k;i<a.length;i++) {
            {int t=a[i];a[i]=a[k];a[k]=t;}
            f(a,k+1);
            {int t=a[i];a[i]=a[k];a[k]=t;}
        }

    }

    public static  void test(int[] a){
        if(a[1]<a[0])return ;
        if(a[2]<a[0])return ;
        if(a[3]<a[1])return ;
        if(a[4]<a[1])return ;
        if(a[4]<a[2])return ;
        if(a[5]<a[2])return ;
        if(a[6]<a[3])return ;
        if(a[7]<a[3])return ;
        if(a[7]<a[4])return ;
        if(a[8]<a[4])return ;
        if(a[8]<a[5])return ;
        if(a[9]<a[5])return ;
       show(a);
       N++;
    }

    public static void show(int[] a){
        System.out.println("   "+a[0]);
        System.out.println("  "+a[1]+" "+a[2]);
        System.out.println(" "+a[3]+" "+a[4]+" "+a[5]);
        System.out.println(""+a[6]+" "+a[7]+" "+a[8]+" "+a[9]);
        System.out.println();
    }

}
