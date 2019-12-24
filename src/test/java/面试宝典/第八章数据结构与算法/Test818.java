package 面试宝典.第八章数据结构与算法;
/*
* 如何在不知到头指针的情况下删除指定的节点
* */
public class Test818 {
    public static void main(String[] args) {

    }

    public boolean deleteNode(Node n){
        if(n == null || n.next == null){
            return false;
        }
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }

}
