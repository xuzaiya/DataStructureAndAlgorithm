package 蓝桥杯.真题.第九届;
/*
*
标题：星期一

整个20世纪（1901年1月1日至2000年12月31日之间），一共有多少个星期一？
(不要告诉我你不知道今天是星期几)

注意：需要提交的只是一个整数，不要填写任何多余的内容或说明文字。
* */
public class Demo2 {
    public static void main(String[] args) {
        int year  = 1901;
        int sum = 0;
        while(year<=2000){
            if(year%4==0&&(year%100!=0&&year%400 == 0)){
                sum+=366;
            }else{
                sum+=365;
            }
            year++;
        }

        System.out.println(sum/7); //5214




    }

}
