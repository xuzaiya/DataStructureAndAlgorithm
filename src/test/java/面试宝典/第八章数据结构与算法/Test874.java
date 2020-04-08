package 面试宝典.第八章数据结构与算法;
/*
*
* */
public class Test874 {
    public static TreeNode root;
    public Test874(){
        root = null;
    }

    //后序遍历方法递归实现
    public void postOrder(TreeNode localRoot){
        if(localRoot !=null){
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.data+" ");
        }
    }

    public void initTree(int[]preOrder,int[]inOrder){
        this.root = this.initTree(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
    }


    public TreeNode initTree(int[]preOrder,int start1 ,int end1,int[]inOrder,int start2,int end2){
        if(start1>end1 || start2>end2){
            return null;
        }

        int rootData = preOrder[start1];
        TreeNode head = new TreeNode(rootData);
        //找到根节点所在的位置
        int rootIndex = findIndexInArray(inOrder,rootData,start2,end2);
        int offSet = rootIndex - start2 -1;
        //构建左子树
        TreeNode left = initTree(preOrder,start1+1,start1+1+offSet,inOrder,start2,start2+offSet);
        //构建右子树
        TreeNode right = initTree(preOrder,start1+offSet+2,end1,inOrder,rootIndex+1,end2);
        head.left = left;
        head.right = right;
        return head;


    }

    public int findIndexInArray(int[] arr,int x,int begin,int end){
        for (int i=begin;i<=end;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String []args){
        Test874 biTree = new Test874();
        int[] preOrder ={1,2,4,8,9,5,10,3,6,7};
        int[] inOrder = {8,4,9,2,10,5,1,6,3,7};
        biTree.initTree(preOrder,inOrder);
        System.out.println("二叉树的后序遍历：");
        biTree.postOrder(root);
    }

}
