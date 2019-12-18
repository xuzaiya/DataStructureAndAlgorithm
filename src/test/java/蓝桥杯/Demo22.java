package 蓝桥杯;

public class Demo22 {
    public static void main(String[] args) {
       /* int sum=0;
        int temp = 0;
        for (int i=1;i<=100;i++){
            temp +=i;
            sum+=temp;
        }

        System.out.println(sum);*/

       int sum = 0;
       for (int i=1;i<=100;i++){
           sum +=Sum(i);
       }
        System.out.println();

    }

    public static int Sum(int i){
        if(i == 1)
            return 1;
        return Sum(i-1)+i;
    }
}
