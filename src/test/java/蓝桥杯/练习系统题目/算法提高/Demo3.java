package 蓝桥杯.练习系统题目.算法提高;
/*
* 编写函数，其功能为把一个十进制数转换为其对应的八进制数。程序读入一个十进制数，调用该函数实现数制转换后，输出对应的八进制数。

 样例输入
 9274
 样例输出
 22072
样例输入
 18
 样例输出
 22
* */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Convert(9274));

        //String str = "jdfdkdjkk";
        //System.out.println(str.substring(6,9));

    }
    public static String  Convert(int n){

        if(n == 0)
            return "0";
        //先把十进制数转换成二进制
        String str = "";
        while(n>0){
            int m = n%2;
            str=m+str;
            n/=2;
        }
        //str就是n的二进制表示
        if(str.length()%3 ==1){
            str ="00"+str;
        }

        if(str.length()%3 == 2){
            str = "0"+str;
        }

        int start = 0;
        int end = 3;
        String result = "";
        for (int i=0;i<str.length()/3;i++){
            String subStr = str.substring(start, end); //抽取三个二进制字符
            start += 3;
            end += 3;
            result = result+func(subStr);
        }



        if(result.charAt(0) =='0')
            result = result.substring(1);




        return result;
    }


    public static String  func(String str){
        switch (str){
            case "000": return "0";
            case "001": return "1";
            case "010": return "2";
            case "011": return "3";
            case "100": return "4";
            case "101": return "5";
            case "110": return "6";
            case "111": return "7";
            default:
                return "0";
        }
    }
}

