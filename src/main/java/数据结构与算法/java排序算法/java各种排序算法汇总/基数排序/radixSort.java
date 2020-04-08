package 数据结构与算法.java排序算法.java各种排序算法汇总.基数排序;

import java.util.Arrays;

public class radixSort {

    public static void main(String[] args) {
        radixSort(new int[]{6, 10, 25, 80, 612, 8, 12, 15, 9, 6, 7});
    }

    public static void radixSort(int[] arr) {
        /*创建一个10*arr.length的二维数组*/
        int[][] duck = new int[10][arr.length];

        /*先获取最大值*/
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = (int) (arr[i] + 1);
            }
        }

        for (int i = 1; max > 0; i *= 10) {
            //记录每个桶的下标
            int[] count = new int[10];
            for (int j = 0; j < arr.length; j++) {
                int t = (arr[j] / i) % 10;
                duck[t][count[t]++] = arr[j];
            }
            /* 将桶中的数放回原数组 等待下一位数的排序 */
            for (int j = 0, c = 0; j < 10; j++) {
                for (int k = 0; k < count[j]; k++) {
                    arr[c++] = duck[j][k];
                }
            }

            max /= i;
        }
        System.out.println(Arrays.toString(arr));
    }


}
