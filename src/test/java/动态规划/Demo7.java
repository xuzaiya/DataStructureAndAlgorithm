package 动态规划;

/*
* N个整数组成的序列a[1],a[2],a[3],…,a[n]，求该序列如a[i]+a[i+1]+…+a[j]的连续子段和的最大值。
当所给的整数均为负数时和为0。
例如：-2,11,-4,13,-5,-2，和最大的子段为：11,-4,13。和为20。
* */
public class Demo7 {

    public static void main(String[] args) {
        int a[] = {-2, 11, -4, 13, -5, -2};
        System.out.println(maxSubSum1(a));
    }


    public static int maxSubSum1(int[] a) {
        int maxSum = 0;
        int nowSum = 0;
        for (int i = 0; i < a.length; i++) {
            nowSum = nowSum + a[i];
            if (nowSum > maxSum) {//更新最大子段和
                maxSum = nowSum;
            }
            if (nowSum < 0) {//当当前累加和为负数时舍弃，重置为0
                nowSum = 0;
            }
        }
        return maxSum;
    }
}
