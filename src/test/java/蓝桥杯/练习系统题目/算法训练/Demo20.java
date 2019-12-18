package 蓝桥杯.练习系统题目.算法训练;

import java.util.Stack;

/*
* 中缀表达式 -》 后缀表达式
*
* 后缀表达式的计算
* 按次序读取后缀表达式的每一个字符。
读取到操作数时，把操作数压入栈中。
读取到操作符时，对栈顶的2个操作数做相应运算，要注意操作数的前后顺序。结果压入栈中。
读取完所有的字符后，弹出栈。得到的值就是所求结果。
*
* */
public class Demo20 {
    static Stack<Character> op = new Stack<>();

    public static void main(String[] args) {
        //constraint: the operand should be
        // equal or greater than 0
        // but equal or less than 9
        String exp = "5+2*(3*(2-1))";
        String houzhui = getrp(exp);
        System.out.println(houzhui);
        System.out.println(calrp(getrp(exp)));

    }

    public static Float getv(char op, Float f1, Float f2){
        if(op == '+') return f2 + f1;
        else if(op == '-') return f2 - f1;
        else if(op  == '*') return f2 * f1;
        else if(op == '/') return f2 / f1;
        else return Float.valueOf(-0);
    }

    //后缀表达式的计算
    public static float calrp(String rp) {
        Stack<Float> v = new Stack<>();
        char[] arr = rp.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            Character ch = arr[i];

            // if is operand, push to the stack
            if (ch >= '0' && ch <= '9') v.push(Float.valueOf(ch - '0'));

                // if is operator, calculate the result
                // with top 2 operands in the stack,
                // push the result into the stack
            else v.push(getv(ch, v.pop(), v.pop()));
        }
        return v.pop();
    }

    //将中缀表达式  -》  后缀表达式
    public static String getrp(String s){
            char[] arr = s.toCharArray();
            int len = arr.length;
            String out = "";

            for(int i = 0; i < len; i++){
                char ch = arr[i];
                if(ch == ' ') continue;

                // if is operand, add to
                // the output stream directly
                if(ch >= '0' && ch <= '9') {
                    out+=ch;
                    continue;
                }

                //if is '(', push to the stack directly
                if(ch == '(') op.push(ch);

                //if is '+' or '-', pop the operator
                // from the stack until '(' and add to
                // the output stream
                //push the operator to the stack
                if(ch == '+' || ch == '-'){
                    while(!op.empty() && (op.peek() != '('))
                        out+=op.pop();
                    op.push(ch);
                    continue;
                }

                //if is '*' or '/', pop the operator stack and
                // add to the output stream
                // until lower priority or '('
                //push the operator to the stack
                if(ch == '*' || ch == '/'){
                    while(!op.empty() && (op.peek() == '*' || op.peek() == '/'))
                        out+=op.pop();
                    op.push(ch);
                    continue;
                }

                //if is ')' pop the operator stack and
                // add to the output stream until '(',
                // pop '('
                if(ch == ')'){
                    while(!op.empty() && op.peek() != '(')
                        out += op.pop();
                    op.pop();
                    continue;
                }
            }
            while(!op.empty()) out += op.pop();
            return out;
        }






}
