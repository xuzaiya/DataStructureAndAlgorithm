package 面试宝典.第八章数据结构与算法;
/*
* 如何找到单链表的中间节点
* */
public class Test816 {
    public static void main(String[] args) {

    }
    //快慢指针
    public Node SearchMidNode(Node head){
        Node p = head;
        Node q = head;
        while(p!=null && p.next!=null && p.next.next!=null){
            p = p.next.next;
            q=q.next;
        }
        return q;
    }
}
