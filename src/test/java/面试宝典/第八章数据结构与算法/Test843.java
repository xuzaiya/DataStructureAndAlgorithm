package 面试宝典.第八章数据结构与算法;
/*
* 如何求二进制数中 1  的个数
* */
public class Test843 {
    public static void main(String[] args) {
        System.out.println(CountOne(7));
        System.out.println(CountOne2(7));
    }
    public static  int CountOne(int n){
        int count = 0; //用来计数
        while(n>0){
            if((n&1) == 1){ //判断最后一位是不是1
                count++;
            }
            n>>=1;
        }
        return count;
    }

    //效率更高的算法
    // n&(n-1) 每次都会是n中少一位1
    public static int CountOne2(int n){
        int count = 0; //用来计数
        while(n>0){
            if(n!=0){
                n=n&(n-1);
                count++;
            }
        }
        return count;
    }

}
