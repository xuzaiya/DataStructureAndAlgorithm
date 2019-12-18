package 面试宝典.第八章数据结构与算法;

import java.util.Arrays;

/*
* 如何求数组中两个数相加等于20的组合种数
* */
public class Test855 {
    public static void main(String[] args) {
        int array[] = {1,7,17,2,6,3,14};
        //findSum(array,20);

        findSum2(array,20);
    }

    //暴力法  时间复杂度为O(n^2)
    public static void findSum(int []arr,int sum){
        int length = arr.length;
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if(arr[i]+arr[j] == sum){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }


    //排序方法
    public static void findSum2(int []array,int sum){
        Arrays.sort(array);
        int length = array.length-1;
        for (int i=0,j=length;i<j;){
            if(array[i]+array[j]>sum){
                j--;

            }else if (array[i]+array[j]<sum){
                i++;

            }else{
                System.out.println(array[i]+","+array[j]);
                i++;
                j--;

            }
        }
    }
}
