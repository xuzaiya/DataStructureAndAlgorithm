package 蓝桥杯.真题.第九届;

public class Demo3 {
    public static long RealPart=2;
    public static long ImaginaryPart=3;
    public static void main(String[] args) {
        long A =2,B=3;
        long temp ;
        for (int i=1;i<123456;i++){
            temp = A*RealPart-B*ImaginaryPart;
            B=A*ImaginaryPart+B*RealPart;
            A=temp;
        }
        System.out.print(A);
        if(B>0){
            System.out.print("+"+B+"i");
        }else if(B==0){

        }else{
            System.out.println(B+"i");
        }
         //4043220979119144065-7374402350132176768i

    }
}
