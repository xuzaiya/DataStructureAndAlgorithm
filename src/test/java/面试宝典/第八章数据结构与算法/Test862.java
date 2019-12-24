package 面试宝典.第八章数据结构与算法;

import java.util.Arrays;

/*
* 如何判断两个字符串是由相同的字符组成
* */
public class Test862 {
    public static void main(String[] args) {
        String s1 = "aaaabbc";
        String s2 = "abcbaaa";
        compare(s1,s2);

    }
    /*
    * 排序，然后比较两个字符串是否相等
    * */
    public static void compare(String s1,String s2){
        byte[] b1=s1.getBytes();
        byte[] b2 = s2.getBytes();
        Arrays.sort(b1);
        Arrays.sort(b2);
        s1 = new String(b1);
        s2 = new String(b2);
        if(s1.equals(s2))
            System.out.println("equal");
        else
            System.out.println("not equal");
    }

    /*
    * 空间换时间
    * */
    public static void compare2(String s1,String s2){
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        int[] bCount = new int[256];
        //声明一个字节数组并进行初始化
        for (int i=0;i<256;i++){
            bCount[i] = 0;
        }

        for (int i=0 ;i<b1.length;i++){
            bCount[b1[i]-'0']++;
        }
        for (int j=0;j<b2.length;j++){
            bCount[b2[j]='0']--;
        }
        for (int i=0;i<256;i++){
            if(bCount[i]!=0){
                System.out.println("not equal");
                return ;
            }
        }
        System.out.println("equal");
    }

}
