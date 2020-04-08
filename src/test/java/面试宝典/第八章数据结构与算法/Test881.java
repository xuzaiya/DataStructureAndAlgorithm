package 面试宝典.第八章数据结构与算法;
/*
*
* 如何消除嵌套的括号
* */
public class Test881 {
    public static void main(String[] args) {
        String str = "(1,(2,3),(4,(5,6),7))";
        String result = change_str(str);
        System.out.println(result);
    }

    public static String change_str(String str){
        String result = "(";
        char[] ch = str.toCharArray();
        int bracket_num = 0;
        int i = 0;
        while(i<ch.length){
            if(ch[i] == '('){
                bracket_num++;
            }else if(ch[i]==')'){
                if (bracket_num>0){
                    bracket_num--;
                }else{
                    System.out.println("Expression Wrong!\n");
                    return null;
                }
            }else if(ch[i] == ','){
                result+=ch[i++];
                continue;
            }else if(ch[i]>='0'&&ch[i]<='9'){
                result+=ch[i];
            }else{
                System.out.println("Expression Wrong!\n");
                return null;
            }
            i++;
        }

        if(bracket_num>0){
            System.out.println("Expression Wrong!\n");
            return null;
        }
        result+=")";
        return result;

    }

}
