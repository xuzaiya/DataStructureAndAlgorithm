package 面试宝典.第八章数据结构与算法;
/*
* 如何求最大子数组之和
* */
public class Test853 {
    public static void main(String[] args) {
        int[] array = {1,-2,4,8,-4,7,-1,-5};
        System.out.println(maxSubArray(array));

        System.out.println(maxSubArray2(array));

        System.out.println(maxSubArray3(array));
    }

    //时间复杂度太高 n^3
    public static int maxSubArray(int[]arr){
        int n = arr.length;
        int ThisSum=0,MaxSum=0,i,j,k;
        for (i=0;i<n;i++){
            for (j=i;j<n;j++){
                ThisSum = 0;
                for (k=i;k<j;k++){
                    ThisSum+=arr[k];
                }
                if(ThisSum>MaxSum){
                    MaxSum = ThisSum;
                }
            }
        }
        return MaxSum;
    }


    //时间复杂度为你n^2
    public static int maxSubArray2(int arr[]){
        int size= arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<size;i++){
            int sum = 0;
            for (int j=i;j<size;j++){
                sum+=arr[j];
                if (sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    //动态规划的方法O(n)
    public static int maxSubArray3(int[]arr){
        int n = arr.length;
        int End[] = new int[n];
        int All[] = new int[n];
        End[n-1] = arr[n-1];
        All[n-1] = arr[n-1];
        End[0] = All[0] = arr[0];
        for (int i=1;i<n;++i){

            End[i] = max(End[i-1]+arr[i],arr[i]);
            All[i] = max(End[i],All[i-1]);
        }
        return All[n-1];
    }

    public static int max(int m,int n){
        return m>n?m:n;
    }

    public static int maxSubArray4(int arr[]){
        int n  = arr.length;
        int nAll = arr[0];
        int nEnd = arr[0];
        return 0;
    }


}
