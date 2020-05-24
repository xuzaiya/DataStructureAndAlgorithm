package 蓝桥杯;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
//排列组合ABCDE
public class Demo6 {
    public static void main(String[] args) {
        int count =0;
        List list = f("LANQIAO");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Set<String> set = new HashSet<>();
        for(int i=0;i<list.size();i++){
            if(!set.contains(list.get(i))){
                count++;
            }
        }
        System.out.println(count);
        //System.out.println(12.5*1024*1024);




    }

    public static List f(String s){
        List list = new Vector();
        if(s.length() == 1){
            list.add(s);
            return list;
        }
        for (int i=0;i<s.length();i++){
            char x = s.charAt(i);
            List t = f(s.substring(0,i)+s.substring(i+1));
            for(int k=0;k<t.size();k++){
                list.add(""+x+t.get(k));
            }
        }
        return list;
    }





}
