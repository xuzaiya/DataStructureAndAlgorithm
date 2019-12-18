package 蓝桥杯;

import java.math.BigInteger;

/*
   日期差问题：
   2015-3-2 距离 1979-12-15多少天？
*
*
* */
public class Demo16 {


    public static void main(String[] args) {
        System.out.println(day_dif(1979,12,15,2015,3,2));
    }


    public static int day_dif(int year1,int month1,int day1,int year2,int month2,int day2){
        return get_days(year2,month2,day2) - get_days(year1,month1,day1);
    }

    public static int get_days(int year,int month,int day){
        int[] M={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(is_leap_year(year))M[2]++;
        int sum=0;
        for (int i=1;i<year;i++){
            sum+=365;
            if(is_leap_year(i))
                sum++;
        }

        for (int i=1;i<month;i++){
            sum+=M[i];
        }

        sum+=day;
        return sum;
    }

    static boolean is_leap_year(int year){
        if(year%4==0||(year%100!=0&&year%400==0)){
            return true;
        }else{
            return false;
        }
    }






}
