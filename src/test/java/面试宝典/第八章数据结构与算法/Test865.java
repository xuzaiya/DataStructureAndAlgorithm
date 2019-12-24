package 面试宝典.第八章数据结构与算法;

import java.util.HashSet;
import java.util.Set;

/*
 * 如何按要求打印数组的排列情况
 * 要求  4不能再第三位  3和5不能相连
 *
 * */
public class Test865 {
    private int[] numbers = new int[]{1,2,2,3,4,5};
    private int n = numbers.length;
    //用来标记图中节点是否被遍历过
    private boolean[] visited = new boolean[n];
    //图的二维数组表示
    private int[][] graph = new int[n][n];
    //数字的组合
    private String combination = "";
    public Set<String> getAllCombinations() {
        //构造图
        buildGraph();
        //用来存放所有组合
        Set<String> set = new HashSet<>();
        //分别从不同的节点出发深度遍历图
        for (int i=0;i<n;i++){
            this.depthFirstSearch(i,set);
        }
        return set;
    }

    private void buildGraph(){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j){
                    graph[i][j] = 0;
                }else{
                    graph[i][j] =1;
                }
            }
        }
    }

    //对树从节点start位置开始深度遍历
    private void depthFirstSearch(int start,Set<String>set){

    }


    public static void main(String[] args) {

    }
}
