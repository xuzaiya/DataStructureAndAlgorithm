package 数据结构与算法.java链表.用双向链表实现队列;

import 数据结构与算法.java链表.双向链表的实现.DoublePointLinkedList;

public class QueueLikedList {
    private DoublePointLinkedList dp;
    public QueueLikedList(){
        dp = new DoublePointLinkedList();
    }

    public void insert(Object data){
        dp.addTail(data);
    }

    public void delete(){
        dp.deleteHead();
    }

    public boolean isEmpty(){
        return dp.isEmpty();
    }

    public int getSize(){
        return dp.getSize();
    }

    public void display(){
        dp.display();
    }
}
