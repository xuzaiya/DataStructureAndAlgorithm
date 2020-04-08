package 蓝桥杯.真题.第九届;

/*
*
我们以某个小方格的一个顶点为圆心画一个半径为1000的圆。
你能计算出这个圆里有多少个完整的小方格吗？

注意：需要提交的是一个整数，不要填写任何多余内容。



圆心为坐标原点，一共四个象限，计算出一个象限的所有完整方格*4即可。

在第一象限里面考虑半径*半径个方格（这些方格都是和圆所接触的）。

用这些方格的左下角的坐标代表它们，所以遍历的横纵坐标都是1000-1，只要两点之间距离小于等于半径即可。


* */
public class Demo4 {
    public static void main(String[] args) {
        int count = 0;
        int radis = 1000 * 1000;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                int a = i + 1;
                int b = j + 1;
                if (a * a + b * b <= radis) {
                    count++;
                }
            }
        }
        System.out.print(count * 4); //3137548
    }
}
