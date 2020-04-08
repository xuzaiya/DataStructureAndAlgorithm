package 面试宝典.第八章数据结构与算法;
/*
* 如何进行选择排序
* */
public class Test831 {
    public static void main(String[] args) {

    }

    public static void selectSort(int[]a){
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            //每次记住最小的数的下标
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[min])
                    min = j;
            }
            if (min!=i){
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
    }
}
