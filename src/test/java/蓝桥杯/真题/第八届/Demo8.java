package 蓝桥杯.真题.第八届;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] baozi = new int[num];
        int dp[] = new int[100 * 100 + 5];
        for (int i = 0; i < num; i++) {
            baozi[i] = scan.nextInt();
        }

        scan.close();
        int g = baozi[0];
        for (int i = 1; i < num; i++) {
            g = gcd(g, baozi[i]);
        }
        //如果两个数不互质，则表示不出来的数有无限个
        if (g != 1) {
            System.out.println("INF");
            return;
        }
        //baozi[]数组的下标用来存放能凑出的包子数
        dp[0]=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j + baozi[i] < 100 * 100 + 5; j++) {
                if (dp[j] == 1) {//假设j==3,意思是三个包子能凑出来，3加任何容量的抽屉包子数都能凑出来
                    dp[j + baozi[i]] = 1;
                }
            }
        }
        //凑不出的包子数
        int cnt = 0;
        for (int i = 0; i < 100 * 100 + 5; i++) {
            if (dp[i] != 1) {

                cnt++;
            }
        }
        System.out.println(cnt);
    }


    //求最大公约数
    private static int gcd(int i, int j) {
        if (j == 0) {
            return i;
        }
        return gcd(j, i % j);
    }

}
