package 面试宝典.第八章数据结构与算法;
/*
* 如何找出数组中第二大的数
* 一次遍历  定义两个变量，分别记住最大值和第二大的值
* 遍历  如果遍历到比最大值还大的  就把旧的最大值给第二大的值，新的最大值给旧的最大值
* */
public class Test852 {
    public static void main(String[] args) {
        int[]array = {7,3,19,40,4,7,1};
        System.out.println(FindSecondMax(array));
    }

    public static int FindSecondMax(int []data){
        int count = data.length;
        int maxnumber = data[0];
        int second = Integer.MIN_VALUE;
        for (int i=1;i<count;i++){
            if(data[i]>maxnumber){
                second = maxnumber;
                maxnumber = data[i];
            }else{
                if(data[i]>second){
                    second = data[i];
                }
            }
        }
        return second;
    }
}
