package 面试宝典.第八章数据结构与算法;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
* 如何找出数组中重复元素最多的数
* */
public class Test854 {

    public static void main(String[] args) {
        int array[] = {1,5,4,3,4,4,5,4,5,5,6,6,6,6,6,6,6,6,6,6,9};
        int maxFrequenceNum = findMostFrequentInArray(array);
        System.out.println(maxFrequenceNum);
    }

    public static int findMostFrequentInArray(int[]arr){
        int result = 0;
        int size = arr.length;
        if (size == 0){
            return Integer.MAX_VALUE;
        }
        //记录每个元素出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<size;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        //找出出现次数最多的元素
        int most = 0;
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry =(Map.Entry)iter.next();
            int key = (Integer)entry.getKey();
            int value = (Integer) entry.getValue();
            if(value>most){
                result = key;
                most = value;
            }
        }
        return result;


    }
}
