package 蓝桥杯.练习系统题目.基础练习;

public class Demo9 {
    public static void main(String[] args) {
        String []a = new String[5];
        for(int i=0;i<32;i++){
            int n=i;
            for(int j=0;j<5;j++){
                a[j]=n%2+"";
                n=n/2;
            }
            System.out.println(a[4]+a[3]+a[2]+a[1]+a[0]);
        }

    }
}
