package 面试宝典.第八章数据结构与算法;
/*
* 如何找出数组中唯一重复的元素
* */
public class Test859 {
    public static void main(String[] args) {
        int arr[] = {7,9,13,13,8};
        int missingNum = xor_finddup(arr);
        System.out.println(missingNum);
    }

    private static int xor_finddup(int[] arr) {
        int n =arr.length;
        int temp1 = 0;
        int temp2 = 0;
        for (int i=0;i<n-1;i++){
            temp1+=(i+1);
            temp2+=arr[i];
        }

        temp2+=arr[n-1];
        int result = temp2-temp1;
        return result;
    }


}
