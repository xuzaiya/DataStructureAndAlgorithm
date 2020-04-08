package 面试宝典.第八章数据结构与算法;
/*
* 如何进行插入排序
* */
public class Test832 {
    public static void main(String[] args) {

    }



    public static void insertSort2(int []a){
        for (int i=1;i<a.length;i++){
            int j=i-1;
            int temp = a[i];
            while(j>=0&&a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }

}
