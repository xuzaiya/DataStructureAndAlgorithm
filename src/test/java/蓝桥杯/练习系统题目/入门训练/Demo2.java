package 蓝桥杯.练习系统题目.入门训练;

import java.util.Scanner;

//求圆的面积
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double m = getArea(r);
        System.out.printf("%.7f\n",m);
    }




    public static double getArea(int r){
        double area;
        area = (double)(Math.PI*r*r);
        return area;
    }
}
