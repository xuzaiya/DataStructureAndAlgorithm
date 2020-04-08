package 面试宝典.第八章数据结构与算法;
/*
* 如何不使用比较运算符就可以求出来两个数的最大值和最小值
* */
public class Test882 {
    public static void main(String[] args) {
        System.out.println(max(3,6));
    }

    public static int max(int a,int b){
        return (int)(((long)a+(long)b+Math.abs((long)a-(long)b))/2);
    }

    public static int min(int a,int b){
        return (int)(((long)a+(long)b-Math.abs((long)a-(long)b))/2);
    }
}
