package 蓝桥杯.练习系统题目.算法训练;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 贪心算法
*
* */
public class Demo11 {
    public static void main(String[] args) {
        //greedyGiveMoney(345);
         int[] weight = {4,10,7,11,3,5,15,2};
        int count = maxLoading(weight);
        //System.out.println(count); // 5

        //System.out.println(maxProd(10));

        /*
        * 活动安排
        * */
        int[]start = {1,3,0,5,3,5,6,8,8,2,12};
        int [] end = {4,5,6,7,8,9,10,11,12,13,14};
        /*List<Integer> results = arrangeActivity(start,end); //这他妈都把活动已经安排妥当了
        for (int i=0;i<results.size();i++){
            int index = results.get(i);
            System.out.println("开始时间："+start[index]+",结束时间："+end[index]);
        }*/


        /*
        任务调度
        * */
        char[] tasks= {'A','A','A','B','B','B'};
        int n=2;

        int result=-1;

        //result=leastInterval(tasks, n);
        //System.out.println("result = "+result);


        /*
        * 重构字符串
        * */
        String abcdeaadhbw = reorganizeString("abcdeaadhbw");
        System.out.println(abcdeaadhbw);


    }

    /*
    * 纸币找零问题
     * 假设1元，2元，5元，10，元，20元，50元，100元，张数不限，现在要用来支付k元，至少要支付多少张
    * */
    public static void greedyGiveMoney(int money){
        System.out.println("需要找零："+money);
        int[] moneyLevel = {1,2,5,10,20,50,100};
        for (int i=moneyLevel.length-1;i>=0;i--){
            int num = money/moneyLevel[i];
            int mod = money %moneyLevel[i];
            money = mod;
            if(num>0){
                System.out.println("需要"+num+"张"+moneyLevel[i]+"块的");
            }
        }
    }


    /*

    * 最优装载问题
    * 一条小船用来运输古董到河对岸。假设船的最大载重量为MAXWEIGHT，每件古董的重量为w_i，怎么能够装载最多数量的古董到船上呢？

        样例数据：

        MAXWEIGHT 为 30

        给定8个古董，重量分别为：[4, 10, 7, 11, 3, 5, 14, 2]
    * */
    public static int MAXWEIGHT = 30;//小船的载重量
    public static int AMOUNT=8;//古董个数

    public static int maxLoading(int[] weight){
        int counter = 0; //记录已经装载的古董个数
        //对数组进行排序
        Arrays.sort(weight);
        int temp = 0; //记录装在船上的古董的重量
        for (int i=0;i<AMOUNT;i++){
            temp+=weight[i]; //贪心策略：每次装入最轻的古董
            if(temp<=MAXWEIGHT){
                counter++;
            }else{
                break;//超重
            }
        }
        return counter;

    }



    /*
    * 题目三： 剪绳子
    * 给定一根长度为n的绳子，请把绳子剪成m段，每段绳子记为k[0],k[1]……k[m]。请问k[0]*k[1]……*k[m]可能的最大乘积是多少？例如：当绳子长度为8时，
    * 我们把它剪成长度分别为2,3,3段，此时最大乘积为18.
算法分析
从问题的某一个初始解出发逐步逼近给定的目标，以尽可能快的地求得更好的解。当达到某算法中的某一步不能再继续前进时，算法停止，这就是贪婪算法。
在剪绳子中，如果绳子的长度大于5，则每次剪出的长度为3的绳子。如果剩下的长度仍然大于5，则接着剪出一段长度为3的绳子，重复这个步骤，
直到剩下的长度小于5.时间和空间复杂度都为O(1)。
    * */
    public static int maxProd(int length){
        if(length<2)
            return 0;
        if(length == 2)
            return 1;
        if(length == 3)
            return 2;
        int timesOf3 = length/3;//剪长度为3的绳子段
        if((length - timesOf3*3) == 1) //当长度为4的时候不能去用3剪
            timesOf3--;
        int timesOf2 = (length-timesOf3*3)/2;//这时应该吧绳子剪成长度为2的两段2*2》1*3
        return (int)(Math.pow(3,timesOf3))*((int)Math.pow(2,timesOf2));
    }




    /*
    * 题目四：活动安排问题
    * 设有n个活动的集合e={1，2，…，n}，其中每个活动都要求使用同一资源，如演讲会场等
    * 而在同一时间内只有一个活动能使用这一资源。每个活动i都有一个要求使用该资源的起始时间s_i和
    * 一个结束时间f_i,且s_i< f_i。如果选择了活动i，则它在半开时间区间[s_i，f_i]内占用资源。
    * 若区间[s_i，f_i]与区间[s_j，f_j]不相交，则称活动 i 与活动 j 是相容的。也就是说，
    * 当s_i ≥ f_j或s_j ≥ f_i时，活动 i 与活动 j 相容。活动安排问题就是要在所给的活动集合中选出最大的相容活动子集合。

    *
    *
    * */
    public static List<Integer> arrangeActivity(int[]start, int[]end){
        int total = start.length;
        int endFlag = end[0];
        List<Integer> results = new ArrayList<>();
        results.add(0);
        for (int i=0;i<total;i++){
            if (start[i]>endFlag){
                results.add(i);
                endFlag = end[i];
            }
        }
        return results;
    }


    /*
    * 题目五：任务调度
    * 给定一个用字符数组表示的 CPU 需要执行的任务列表。其中包含使用大写的 A - Z 字母表示的26种不同种类的任务。任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。CPU 在任何一个单位时间内都可以执行一个任务，或者在待命状态。
    然而，两个相同种类的任务之间必须有长度为 n 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。

    你需要计算完成所有任务所需要的最短时间。

    示例 1：

    输入: tasks = ["A","A","A","B","B","B"], n = 2
    输出: 8
    执行顺序: A -> B -> (待命) -> A -> B -> (待命) -> A -> B.
    注：

    任务的总个数为 [1, 10000]
    n 的取值范围为 [0, 100]
    * */
    public static int leastInterval(char[]tasks,int n){
        int[] freq = new int[26];
        for (char c:tasks){
            freq[c-'A']++;
        }
        Arrays.sort(freq);
        int time = 0;
        while (freq[25] > 0) { // while we still have task to do, start from most freq task
            // GREEDY
            // each round/row, try to finish n tasks
            for (int i = 0, p = 25; i <= n; i++) { // n is the cooling down factor, p points to the next task to consume
                if (p >= 0 && freq[p] > 0) { // if there is still task to do
                    freq[p]--; // do task
                    p--; // move p to next freq task
                    time++; // take one cycle
                } else if (freq[25] != 0) { // if this is NOT last row, need to fill in idle cycle
                    time++; // take one cycle
                } // else freq[25] == 0 . no more task to do and last row. we WON'T fill in idle
                // cycle
            }
            // sort again so next round we're going to start from most freq task and consume
            // n task if possible
            Arrays.sort(freq);
        }
        return time;




    }




    /*
    * 题目六：重构字符串
    * 给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
    若可行，输出任意可行的结果。若不可行，返回空字符串。
    示例 1:
    输入: S = "aab"
    输出: "aba"
    示例 2:
    输入: S = "aaab"
    输出: ""
    注意:
    S 只包含小写字母并且长度在[1, 500]区间内。
    *
    * */
    public static String reorganizeString(String S) {
        int[] arr = new int[26];
        int lenght = S.length();
        if(S.length() == 1) return S;
        char[] ret = new char[lenght];
        int maxLength = 0;
        for(char a: S.toCharArray()) {
            if(maxLength < ++arr[a - 'a'])
                maxLength = arr[a - 'a'];
        }
        if(maxLength * 2 - 1 > S.length())
            return "";
        int odd = 0, even = 1;
        for(int i = 0; i < 26; i++) {

            while(arr[i] > 0 && arr[i] < lenght / 2 + 1 && even < lenght) {
                ret[even] = (char)(i + 'a');
                arr[i] --;
                even += 2;
            }
            while(arr[i] > 0) {
                ret[odd] = (char)(i + 'a');
                arr[i] --;
                odd += 2;
            }
        }

        return new String(ret);

    }





}
