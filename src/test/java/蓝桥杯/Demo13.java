package 蓝桥杯;

//天平称重  进制解法
public class Demo13 {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            System.out.println(i+" : "+func(i));
        }
    }



    static String func(int n){
        String s = "";
        int q = 1; //权重

        while(n>0){
            int sh = n/3; //商
            if(n%3 == 1) s="+"+q+s;
            if(n%3 == 2){
                sh++;
                s="-"+q+s;
            }
            n=sh;
            q*=3;
        }
        return s.substring(1);
    }
}
