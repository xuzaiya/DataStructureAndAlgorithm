package 动态规划;

import java.util.Scanner;

/*
题目：求一个数列中最大连续子序列的和。

* 第一步：状态的定义
有的问题过于抽象，或者过于啰嗦干扰我们解题的思路，我们要做的就是将题干中的问题进行转化（换一种说法，含义不变）。
转化成一系列同类问题的某个解的情况，比如说：



我们要将这个原问题转化为：

状态定义：Fk是第k项前的最大序列和，求F1～FN中最大值。

通过换一种表述方式，我们清晰的发现了解决问题的思路，如何求出F1～FN中的最大值是解决原问题的关键部分。
上述将原问题转化成另一种表述方式的过程叫做：状态的定义。这样的状态定义给出了一种类似通解的思路，
把一个原来毫无头绪的问题转换成了可以求解的问题。

第二步：状态转移方程的定义
在进行了状态的定义后，自然而然的想到去求解F1～FN中最大值。这也是状态定义的作用，让我们把一个总体的问题转化成一系列问题，
而第二步：状态转移方程的定义则告诉我们如何去求解一个问题，对于上述已经转换成一系列问题我们要关注的点就在于：
如何能够用前一项或者前几项的信息得到下一项，这种从最优子状态转换为下一个最优状态的思路就是动态规划的核心。
对于上面的例子题目来说，状态转移方程的定义应该是：

Fk=max{Fk-1+Ak,Ak}
Fk是前k项的和，Ak是第k项的值
* */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int thisSum, maxSum;
        thisSum = maxSum = 0;
        for (int i = 0; i < n; i++) {
            thisSum += arr[i];
            if (thisSum > maxSum) {
                maxSum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;
            }
        }

        System.out.println(maxSum);
    }


}
