package 面试宝典.第八章数据结构与算法;
/*
* 如何实现字符串的反转
*
* */
public class Test861 {
    public static void main(String[] args) {
        String str = "how are you";
        System.out.println(new Test861().swapWords(str));
    }

    public void swap(char[] cArr,int front,int end){
        while(front<end){
            char temp = cArr[end];
            cArr[end] = cArr[front];
            cArr[front] = temp;
            front++;
            end--;
        }
    }

    public String swapWords(String s){
        char[]cArrs = s.toCharArray();
        swap(cArrs,0,cArrs.length-1);
        int begin = 0;
        //对单个单子进行字符反转操作
        for (int i =0;i<cArrs.length;i++){
            if(cArrs[i] == ' '){
                swap(cArrs,begin,i-1);
                begin=i+1;
            }
        }
        swap(cArrs,begin,cArrs.length-1);
        return new String (cArrs);
    }
}
