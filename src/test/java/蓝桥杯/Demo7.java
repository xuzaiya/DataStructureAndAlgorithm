package 蓝桥杯;



//排列组合“ABCDE"
public class Demo7 {
    public static void main(String[] args) {
        f("ABCDE".toCharArray(),0);

    }


    //aa:待排数据
    //k:考虑的当前位置
    public static void f(char[]aa,int k){
        if(k==aa.length-1){
            //System.out.println(String.copyValueOf(aa));
            System.out.println(String.valueOf(aa));
            return ;
        }
        for(int i=k;i<aa.length;i++){
            {char t=aa[k];aa[k] = aa[i];aa[i] = t;   }  //试探
            f(aa,k+1);
            { char t=aa[k]; aa[k] = aa[i]; aa[i] = t; } //回溯
        }
    }




}
