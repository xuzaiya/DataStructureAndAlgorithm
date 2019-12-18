package 蓝桥杯;
//反转字符串
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(g("abcdefg"));
    }

    public static String f(String s){
        if(s.length() <=1){
            return s;
        }
        return f(s.substring(1))+s.charAt(0);
    }

    public static String  g(String s){
        if(s.length()<=1){
            return s;
        }
        return s.charAt(s.length()-1)+g(s.substring(0,s.length()-1));
    }
}
