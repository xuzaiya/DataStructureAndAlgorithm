package 面试宝典.第八章数据结构与算法;

import java.util.Arrays;

/*
* 如何找出数组中第k个最小的数
* */
public class Test857 {
    public static void main(String[] args) {
        int[]arr = {1,5,2,6,8,0,6};
        int k = getKMinNum(arr,3);
        System.out.println(k);
    }

    //排序法  将数组排序
    public static int getKMinNum(int[]arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }


}
