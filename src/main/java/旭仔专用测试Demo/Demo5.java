package 旭仔专用测试Demo;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        /*int totalNum = 4;
        int tmallRate = 1;
        int pinddRate = 1;
        float tmallNums = (float) (1.0*tmallRate/(pinddRate+tmallRate));
        int tmallNum =(int)(tmallNums*totalNum);
        System.out.println(tmallNum);*/

        String sql = "120684853235";
        Long id = Long.parseLong(sql);
        System.out.println(id);
        int suitNum = 123;
        long s = (long)-suitNum;
        System.out.println(s);


    }
    public static void f(String res){
        res = "no";
    }
}
