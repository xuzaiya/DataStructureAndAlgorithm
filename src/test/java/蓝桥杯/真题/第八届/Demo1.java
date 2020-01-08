package 蓝桥杯.真题.第八届;

public class Demo1 {
    static char[][]a = new char[10][10];
    static boolean[][]b = new boolean[10][10];
    static int cnt = 0;
    public static void main(String[] args) {
        String str = "UDDLUULRULUURLLLRRRURRUURLDLRDRUDDDDUUUUURUDLLRRUUDURLRLDLRLULLURLLRDURDLULLRDDDUUDDUDUDLLULRDLUURRR";
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                a[i][j] = str.charAt(i*10+j);
            }
        }

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                int x=i;
                int y=j;
                init();
                while(true){
                    if(x<0||x>9||y<0||y>9){
                        cnt++;
                        break;
                    }
                    if(b[x][y] == true){
                        break;
                    }
                    b[x][y] = true;
                    switch (a[x][y]){
                        case 'U':
                            x-=1;break;
                        case 'D':
                            x+=1;break;
                        case 'L':
                            y-=1;break;
                        case 'R':
                            y+=1;break;
                        default:
                            break;
                    }
                }
            }
        }
        System.out.println(cnt);



    }

    private static void init(){
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                b[i][j] = false;
            }
        }
    }
}
