package 数据结构与算法.java排序算法.java各种排序算法汇总.希尔排序;

import java.util.Arrays;

public class shellSort {
    public static void shellSort_(int[] arr){
        //步长
        for (int gap=arr.length/2;gap>0;gap/=2){
            //start用于指定起点在下标gap处
            for (int start=gap;start<arr.length;start++){
                int index = start-gap;
                for (;index>=0;index-=gap){
                    //比较大小
                    if(arr[index]>arr[start]){
                        //交换
                        int temp = arr[index+gap];
                        arr[index+gap] = arr[index];
                        arr[index] = temp;
                    }else{
                        break;
                    }
                }
            }
            //System.out.println(Arrays.toString(arr));
        }
    }

    //希尔排序
    public static void shellSort(int[]arr){
        //步长
        for (int gap = arr.length/2;gap>0;gap/=2){
            //start用户指定起始点的下标gap处
            for(int start=gap;start<arr.length;start++){
                int index = start-gap;
                for (;index>=0;index-=gap){
                    //比较大小
                    if (arr[index]>arr[start]){
                        //交换
                        int temp = arr[index+gap];
                        arr[index+gap] = arr[index];
                        arr[index] = temp;
                    }else{
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {2,7,4,1,5,3,8,6,9,11,10};
        shellSort_(arr);
        System.out.println(Arrays.toString(arr));
    }
}
