package 面试宝典.第八章数据结构与算法;
/*
* 如何实现链表的反转
* */
public class Test814 {
    public static void main(String[] args) {

    }

    public void ReverseIteratively(Node head){
        Node pReservedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while(pNode !=null){
            Node pNext = pNode.next;
            if(pNext == null){
                pReservedHead = pNext;  //反转链表后的表头
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }

    }
}
