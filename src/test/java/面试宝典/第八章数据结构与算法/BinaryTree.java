package 面试宝典.第八章数据结构与算法;

public class BinaryTree {
    private TreeNode root;
    public BinaryTree(){
        root = null;
    }

    //将data插入到排序二叉树中
    public void insert(int data){
        TreeNode newTreeNode = new TreeNode(data);
        if(root == null){
            root = newTreeNode;
        }else{
            TreeNode current = root;
            TreeNode parent;
            while(true){
                //寻找插入的位置
                parent = current;
                if(data<current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = newTreeNode;
                        return ;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newTreeNode;
                        return ;
                    }
                }
            }
        }
    }

    //将数值输入构建二叉树
    public void buildTree(int[]data){
        for (int i=0;i<data.length;i++){
            insert(data[i]);
        }
    }

    //中序遍历方法递归实现
    public void inOrder(TreeNode localRoot){
        if(localRoot !=null){
            inOrder(localRoot.left);
            System.out.print(localRoot.data+" ");
            inOrder(localRoot.right);
        }
    }


    //先序遍历方法递归实现
    public void preOrder(TreeNode localRoot){
        if(localRoot != null){
            System.out.print(localRoot.data+"  ");
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }

    //后序遍历方法递归实现
    public void postOrder(TreeNode localRoot){
        if(localRoot!=null){
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.data+"  ");
        }
    }

    public static void main(String[] args) {
        BinaryTree biTree = new BinaryTree();
        int[] data = {2,8,7,4,9,3,1,6,7,5};
        biTree.buildTree(data);
        System.out.println("二叉树的中序遍历");
        biTree.inOrder(biTree.root);

        System.out.println("二叉树的前序遍历");
        biTree.preOrder(biTree.root);

        System.out.println("二叉树的后序遍历");
        biTree.postOrder(biTree.root);

    }
}
