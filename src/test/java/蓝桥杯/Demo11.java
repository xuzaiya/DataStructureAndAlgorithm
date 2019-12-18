package 蓝桥杯;
/*
* 代表团出访
*X星球要派出一个5人组成的观察团前往W星。
其中：
A国最多可以派出4人。
B国最多可以派出2人。
C国最多可以派出2人。
D国最多可以派出1人。
E国最多可以派出1人。
F国最多可以派出3人。
那么最终派往W星的观察团会有多少种国别的不同组合呢？
*
* */
public class Demo11 {
    public static void main(String[] args) {
        int[] a = {4,2,2,1,1,3};
        func(a,0,5,"");
    }


    //a:可取的最大个数的限定
    //k:目前考虑的位置
    //n:目标名额
    //s:已经决定的代表团成员
     static void func(int[]a,int k,int n,String s){
        if(k == a.length){
            if(n==0) System.out.println(s);
            return ;
        }

        String s2 = s;
        for (int i=0;i<=a[k];i++){
            func(a,k+1,n-i,s2);
            s2+=(char)(k+'A');
        }
    }
}
