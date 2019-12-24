package 面试宝典.第八章数据结构与算法;

/*
* 如何哦判断两个链表是否相交
* */
public class Test819 {
    public static void main(String[] args) {

    }

    //给定两个链表的头结点  找到相交的节点
    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB==null){
            return null;
        }
        int sizeA=1,sizeB=1;
        Node currentA = headA;
        Node currentB = headB;
        //找到A链表的大小
        while(currentA.next!=null){
            currentA= currentA.next;
            sizeA++;
        }
        //找到B链表的大小
        while(currentB.next!=null){
            currentB = currentB.next;
            sizeB++;
        }

        int temp = Math.abs(sizeA-sizeB);
        if(sizeA>sizeB){
            while(temp>0){
                headA= headA.next;
                temp--;
            }
        }else if(sizeA<sizeB){
            while(temp>0){
                headB=headB.next;
                temp--;
            }
        }

        while(headB!=null){
            if(headA==headB){
                return headA;
            }else{
                headA=headA.next;
                headB = headB.next;
            }
        }


        return null;




    }
}
