package 蓝桥杯.真题.第七届;

import java.util.ArrayList;

/*
*
寒假作业

现在小学的数学题目也不是那么好玩的。
看看这个寒假作业：

   □ + □ = □
   □ - □ = □
   □ × □ = □
   □ ÷ □ = □

   (如果显示不出来，可以参见【图1.jpg】)

每个方块代表1~13中的某一个数字，但不能重复。
比如：
 6  + 7 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5

以及：
 7  + 6 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5

就算两种解法。（加法，乘法交换律后算不同的方案）

你一共找到了多少种方案？


请填写表示方案数目的整数。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
* */
public class Demo6 {
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    public static int count = 0;

    public static boolean check() {
        int len = list.size();
        if(len >= 3) {
            if(list.get(0) + list.get(1) != list.get(2))
                return false;
        }
        if(len >= 6) {
            if(list.get(3) - list.get(4) != list.get(5))
                return false;
        }
        if(len >= 9) {
            if(list.get(6) * list.get(7) != list.get(8))
                return false;
        }
        if(len >= 12) {
            if(list.get(9) / list.get(10) != list.get(11) || list.get(9) % list.get(10) != 0)
                return false;
        }
        return true;
    }


    public static void dfs(int step) {
        if(step == 12) {
            System.out.println(list);
            count++;
            return;
        } else {
            for(int i = 1;i <= 13;i++) {
                if(list.contains(i))
                    continue;
                list.add(i);
                if(check() == false) {   //类似八皇后问题，此处进行减枝操作
                    list.remove(list.indexOf(i));
                    continue;
                }
                dfs(step + 1);
                list.remove(list.size() - 1);
            }
        }
        return;
    }


    public static void main(String[] args) {
        dfs(0);
        System.out.println(count);
    }
}
