package 蓝桥杯;

public class Demo19 {
    public static void main(String[] args) {
        int[] a = {1,5,11,24,25,32,32,33,49,66,68,69,70,
        75,88,102,114,119,120,135,146,221,294,300,302,305,308};
        System.out.println(f(a,32));
    }


    //求x应该插入人的位置
    //return 刚好比x稍微大点的那个数的位置
    public static int f(int[]a,int x){
        if(x>=a[a.length-1])return -1;
        return g(a,0,a.length,x);

    }

    static int g(int[] a ,int begin ,int end ,int x){
        if(end - begin == 1){
            if(a[begin]>x)return begin;
            return end ;
        }

        int k = (begin +end)/2;
        if(x>=a[k]){
            return g(a,k,end,x);
        }else{
            return g(a,begin,k,x);
        }

    }
}
