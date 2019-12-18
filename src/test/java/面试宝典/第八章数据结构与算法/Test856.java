package 面试宝典.第八章数据结构与算法;
/*
*
* 如何把一个数组循环右移k位
* */
public class Test856 {
    public static void main(String[] args) {
        int array [] ={1,2,3,4,5,6,7,8};
        shift_k(array,2);
        for (int i :array){
            System.out.print(i+" ");
        }
    }

    public static void reserve(int a[],int b,int e){
        for (;b<e;b++,e--){
            int temp=a[e];
            a[e] = a[b];
            a[b]=temp;
        }
    }

    public static  void shift_k(int arr[],int k){
        int n = arr.length;
        k = k%n; //为了防止k比n大，右移k为跟右移k%n位的结果是一样的
        reserve(arr,n-k,n-1);
        reserve(arr,0,n-k-1);
        reserve(arr,0,n-1);

    }
}
