package 蓝桥杯.真题.第九届;

import java.util.Scanner;

/*
* 标题：倍数问题

【题目描述】
众所周知，小葱同学擅长计算，尤其擅长计算一个数是否是另外一个数的倍数。但小葱只擅长两个数的情况，当有很多个数之后就会比较苦恼。现在小葱给了你 n 个数，希望你从这 n 个数中找到三个数，使得这三个数的和是 K 的倍数，且这个和最大。数据保证一定有解。

【输入格式】
从标准输入读入数据。
第一行包括 2 个正整数 n, K。
第二行 n 个正整数，代表给定的 n 个数。

【输出格式】
输出到标准输出。
输出一行一个整数代表所求的和。

【样例输入】
4 3
1 2 3 4

【样例输出】
9

【样例解释】
选择2、3、4。
* */
public class Demo9 {
    static int max = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        dfs(arr,0,k,0,0);
        System.out.println(max);
    }
    //sum代表当前找到数的总和
    //k题目所给，cur当前遍历到的数组的下标
    //curCount当前找到最大数的个数
    public static void dfs(int[]arr,int sum,int k,int cur,int curCount){
        if(sum%k==0&&curCount == 3&&max<sum){
            max = sum;
        }
        if(cur == arr.length)return ;
        dfs(arr,sum+arr[cur],k,cur+1,curCount+1);
        dfs(arr,sum,k,cur+1,curCount);

    }
}
