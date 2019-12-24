package 面试宝典.第八章数据结构与算法;
/*
* 如何检测一个链表是否有环
* */
public class Test817 {
    public static void main(String[] args) {

    }

    public boolean isLoop(Node head){
        Node fast = head;
        Node slow = head;
        if(fast == null){
            return false;
        }
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }

        return !(fast == null||fast.next!=null);
    }
}
