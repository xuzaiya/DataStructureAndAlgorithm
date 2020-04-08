package 面试宝典.第八章数据结构与算法;
/*
* 如何进行冒泡排序
* */
public class Test833 {
    public static void main(String[] args) {

    }

    public static void BubbleSort(int []arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}
