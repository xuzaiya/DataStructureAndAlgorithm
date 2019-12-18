package 面试宝典.第八章数据结构与算法;
/*
* 如何找到数组中的最大值和最小值
* */
public class Test851 {
    static int Max;
    static int Min;
    public static void main(String[] args) {
        int[] array = {7,3,19,40,4,7,1};
        GetMaxAndMin(array);
        System.out.println("max="+Max);
        System.out.println("min="+Min);
    }
    public static void GetMaxAndMin(int[] arr){
        Max = arr[0];
        Min = arr[0];
        int length = arr.length;
        for (int i=1;i<length-1;i=i+2){
            if(i+1>length){
                if(arr[i]>Max){
                    Max=arr[i];
                }
                if(arr[i]<Min){
                    Min = arr[i];
                }
            }

            if(arr[i]>arr[i+1]){
                if(arr[i]>Max){
                    Max = arr[i];
                }
                if(arr[i+1]<Min){
                    Min = arr[i+1];
                }
            }
            if(arr[i]<arr[i+1]){
                if(arr[i+1]>Max){
                    Max=arr[i+1];
                }
                if(arr[i]<Min){
                    Min = arr[i];
                }
            }
        }

    }
}
