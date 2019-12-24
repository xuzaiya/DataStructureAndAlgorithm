package 面试宝典.第八章数据结构与算法;
/*
* 如何输出字符串的所有组合
* */
public class Test866 {
    public static void main(String[] args) {
        String str = "abc";
        char[] c = str.toCharArray();
        StringBuffer sb = new StringBuffer("");
        int len= c.length;
        for (int i=1;i<=len;i++){
            CombineRecursiveImpl(c,0,i,sb);
        }

    }

    public static void CombineRecursiveImpl(char[]c,int begin,int len,StringBuffer sb){
        if(len == 0){
            System.out.println(sb+" ");
            return ;
        }

        if(begin == c.length){
            return ;
        }

        sb.append(c[begin]);
        CombineRecursiveImpl(c,begin+1,len-1,sb);
        sb.deleteCharAt(sb.length()-1);
        CombineRecursiveImpl(c,begin+1,len,sb);
    }
}
