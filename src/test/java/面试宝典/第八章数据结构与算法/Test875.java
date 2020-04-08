package 面试宝典.第八章数据结构与算法;
/*
* 如何求二叉树中节点的最大距离
* */
public class Test875 {
     class Node {

        public int data;
        public Node left;
        public Node right;
        public int leftMaxDistance;
        public int rightMaxDistance;
        public Node() {
            // TODO Auto-generated constructor stub
        }
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    private Node root;
    public Test875() {
        root=null;
    }

    /**
     * 构建二叉树
     */
    public void buildTree(int[] data){
        for(int i=0;i<data.length;i++){
            insert(data[i]);
        }
    }
    /*
     * 将data插入到二叉树中
     * 1.构建结点
     * 2.寻找插入的位置
     */
    public void insert(int data){
        Node newNode=new Node(data);
        if (root==null) {//根节点为空，空树，新插入的结点即为根结点
            root=newNode;
        }else {//树不为空，找到要插入的位置
            Node curNode=root;
            Node parent=null;
            while(true){
                parent=curNode;
                if (data<curNode.data) {//左子树
                    curNode=curNode.left;
                    if (curNode==null) {
                        parent.left=newNode;
                        return;
                    }
                }else {//右子树
                    curNode=curNode.right;
                    if (curNode==null) {
                        parent.right=newNode;
                        return;
                    }
                }
            }
        }

    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        this.postOrder(this.root);
    }
    public void postOrder(Node localRoot){
        if (localRoot!=null) {
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.data+" ");
        }
    }

    private int maxLen=0;
    private int max(int a,int b){
        return a>b?a:b;
    }

    public void FindMaxDistance(){
        this.FindMaxDistance(this.root);
    }
    public void FindMaxDistance(Node root){
        if (root==null) {
            return;
        }
        if (root.left==null) {
            root.leftMaxDistance=0;
        }
        if (root.right==null) {
            root.rightMaxDistance=0;
        }
        if (root.left!=null) {
            FindMaxDistance(root.left);
        }
        if (root.right!=null) {
            FindMaxDistance(root.right);
        }
        /**
         * 计算左右子树离根结点的最大距离
         */
        if (root.left!=null) {
            root.leftMaxDistance=max(root.left.leftMaxDistance, root.left.rightMaxDistance)+1;
        }
        if (root.right!=null) {
            root.rightMaxDistance=max(root.right.leftMaxDistance, root.right.rightMaxDistance)+1;
        }
        /**
         * 获取二叉树所有结点的最大距离
         */
        if (root.leftMaxDistance+root.rightMaxDistance>maxLen) {
            maxLen=root.leftMaxDistance+root.rightMaxDistance;
        }
    }


    public static void main(String[] args) {

        Test875 tree=new Test875();
        int[] data={2,8,7,4,9,3,1,6,7,5};
        tree.buildTree(data);//构建二叉树
        System.out.println("~~~~~~~~~~后序遍历~~~~~~~~~~");
        tree.postOrder();
        System.out.println();

        System.out.println("二叉树中结点的最大距离");
        tree.FindMaxDistance();
        System.out.println(tree.maxLen);

    }



}






