package 面试宝典.第八章数据结构与算法;
/*
* 如何从尾到头输出单链表
* */
public class Test815 {
    public static void main(String[] args) {

    }

    //遍历链表，将元素放入一个栈中，遍历完后，从栈顶开始输出元素。
    //递归
    public void printListReversely(Node pListHead){
        if(pListHead !=null){
            printListReversely(pListHead.next);
            System.out.println(pListHead.data);
        }
    }
}
