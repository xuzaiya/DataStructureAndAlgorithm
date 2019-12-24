package 面试宝典.第八章数据结构与算法;
/*
* 如何找出数组中只出现一次的数字
* 一个整型数组除了一个数字只出现一次，其他所有数字都出现 了两次
* 找出只出现一次的数   要求时间复杂度为O(n) 空间复杂度为O(1)
* */
public class Test858 {
    public static void main(String[] args) {
        /*int arr[] = {1,2,3,2,4,3,5,4,1};
        int num = findNotDouble(arr);
        System.out.println(num);
        System.out.println(1^2);*/


        int array [] ={1,2,1,2,4,2,4,4,1,3};
        int num2 = findOnlyOne(array,3);
        System.out.println(num2);

    }
    /*
    * 异或，任何一个数异或0等于他自己，任何一个数异或他自己等于0
    *
    * */
    public static int findNotDouble(int arr[]){
        int length = arr.length;
        int result = arr[0];
        for (int i=1;i<length;i++){
            result ^=arr[i];
            System.out.println("和"+arr[i]+"异或的结果是"+result);
        }
        return result;
    }

    /*
    * 如何一个数组中，只有一个数出现了1一次，其他的数都出现了3次
    * */
    public static int findOnlyOne(int arr[],int appearTimes){
        int length = arr.length;
        int[] bitCount = new int[32];
        //计算数组中所有数组对应的二进制数各个位置上出现1的次数
        for(int i=0;i<length;i++){
            for (int j=0;j<32;j++){
                bitCount[j] += ((arr[i]>>j)&1);
            }
        }
        int appearOne = 0;
        for (int i=0;i<32;i++){
            if(bitCount[0]%appearTimes!=0){
                appearOne+=(1<<i);
            }
        }
        return appearOne;
    }
}
