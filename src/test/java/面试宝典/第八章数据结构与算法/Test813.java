package 面试宝典.第八章数据结构与算法;
/*
* 如何找出单链表中的倒数第k个元素
*
* */
public class Test813 {
    public static void main(String[] args) {

    }
    //
    public Node findElem(Node head,int k){
        if(k<1)
            return null;
        Node p1 = head;
        Node p2 = head;
        for (int i=0;i<k-1&&p1!=null;i++){
            p1=p1.next;
        }

        if(p1 == null){
            System.out.println("k不合法");
        }

        while(p1.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;

    }
}
