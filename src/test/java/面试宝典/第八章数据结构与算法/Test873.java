package 面试宝典.第八章数据结构与算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
* 如何层序遍历二叉树
* */
public class Test873 {
    public static void main(String[] args) {


    }
    public ArrayList<Integer> layerTranverse(TreeNode root){
        ArrayList<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode nowNode = q.peek();
            q.poll();
            resultList.add(nowNode.data);
            if (nowNode.left != null) {
                q.add(nowNode.left);
            }
            if (nowNode.right != null) {
                q.add(nowNode.right);
            }
        }

        return resultList;


    }

    public ArrayList<TreeNode> layerTranverse2(TreeNode root){
        ArrayList<TreeNode> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.peek();
            q.poll();
            result.add(node);
            if(node.left!=null){
                q.add(node.left);
            }

            if(node.right!=null){
                q.add(node.right);
            }
        }
        return result;
    }


}
