package 面试宝典.第八章数据结构与算法;
/*
* 如何统计一行字符串中有多少个单词4
* */
public class Test864 {
    public static void main(String[] args) {
        String str = "I am hehao";
        System.out.println(str);
        System.out.println("单词个数为："+wordCount(str));
    }

    public static int wordCount(String s ){
        int word = 0;
        int count = 0;
        for (int i=0;i<s.length();i++){
            //循环第一个是单词  记住1
            if(s.charAt(i) == ' '){
                word = 0;
            }else if(word == 0){
                word = 1;
                count++;
            }
            /*if(s.charAt(i) == ' '){
                count++;
            }*/
        }
        return count+1;
    }



}
