package 面试宝典.第八章数据结构与算法;
/*
* 如何删除字符串中重复的字符
* */
public class Test863 {
    public static void main(String[] args) {
        String str  = "abcaabcd";
        str = removeDuplicate(str);
        System.out.println(str);
    }

    public  static String removeDuplicate(String str){
        str  = reverse(str);
        str = str.replaceAll("(?s)(.)(?=.*\\1)","");
        str = reverse(str);
        return str;
    }

    private static String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
        return sb.toString();

    }
}
