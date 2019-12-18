package 数据结构与算法.java链表.双向链表的实现;

public class DoublePointLinkedList {
    private Node head; // 头节点
    private Node tail ; // 尾节点
    private int size; //节点的个数

    public DoublePointLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    //链表头部新增节点
    public void addHead(Object data){
        Node node = new Node(data);
        if (size == 0 ){
            // 如果链表为空，那么头结点和尾节点是该新增节点
            head = node;
            tail = node;
            size++;
        }else{
            node.next = head;
            head = node;
            size++;
        }
    }

    //链表尾新增节点
    public void addTail(Object data){
        Node node = new Node(data);
        if(size == 0){
            head = node;
            tail = node;
            size++;
        }else{
            tail.next = node;
            tail = node;
            size++;
        }
    }

    //删除头部节点，成功返回true，失败返回false
    public boolean deleteHead(){
        if (size == 0){
            return false;
        }
        if (head.next == null){
            head =null;
            tail=null;
        }else{
            head = head.next;
        }
        size--;
        return true;
    }

    //判断是否为空
    public boolean isEmpty(){
        return size==0;
    }

    //获得链表的节点的个数
    public int getSize(){
        return size;
    }

    //显示节点的信息
    public void display(){
        if (size>0){
            Node node = head;
            int tempSize = size;
            if (tempSize == 1){
                //当前链表只有一个节点
                System.out.println("["+node.data+"]");
                return ;
            }
            while(tempSize>0){
                if (node.equals(head)){
                    System.out.println("["+node.data+"->");
                }else if (node.next == null){
                    System.out.print(node.data+"]");
                }else{
                    System.out.print(node.data+"->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        }else{
            //如果链表一个节点都没有
            System.out.println("[]");
        }
    }

}
