package 蓝桥杯;
/*
* 小明参加了学校的趣味运动会，其中的一个项目是：跳格子。
    地上画着一些格子，每个格子里写一个字，如下所示：（也可参见p1.jpg）

从我做起振
我做起振兴
做起振兴中
起振兴中华

    比赛时，先站在左上角的写着“从”字的格子里，可以横向或纵向跳到相邻的格子里，但不能跳到对角的格子或其它位置。一直要跳到“华”字结束。

    要求跳过的路线刚好构成“从我做起振兴中华”这句话。

    请你帮助小明算一算他一共有多少种可能的跳跃路线呢

*
*
* */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(f(5,4));
    }


    public static int f(int x,int y){
        if(x==1||y==1)return 1;
        return f(x-1,y)+f(x,y-1);
    }
}
