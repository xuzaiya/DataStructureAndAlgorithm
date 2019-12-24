package 面试宝典.第八章数据结构与算法;

import java.util.Hashtable;

/*
* 如何从链表中删除重复数据
* */
public class Test812 {
    public static void main(String[] args) {

    }

    //遍历链表，把所有的值放进hashTable中，然后删除重复的值  时间复杂度低  但是需要额外的存储空间
    public void deleteDuplacate(Node head){
        Hashtable<Integer,Integer> table = new Hashtable<>();
        Node temp = head;
        Node pre = null;
        while(temp!=null){
            if(table.containsKey(temp.data)){
                pre.next = temp.next;
            }else{
                table.put(temp.data,1);
                pre = temp;
            }
            temp = temp.next;
        }
    }

    //双重循环遍历，外循环正常遍历，外循环正常遍历链表，内循环遍历到相同的就删除
    public void deleteDeuplecate(Node head){
        Node p = head;
        while(p!=null){
            Node q = p;
            while(q.next!=null){
                if(p.data == q.data){
                    q.next = q.next.next;
                }else{
                    q = q.next;
                }
            }
            p = p.next;
        }
    }
}
