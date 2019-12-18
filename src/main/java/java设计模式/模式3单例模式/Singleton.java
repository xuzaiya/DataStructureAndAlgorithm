package java设计模式.模式3单例模式;

public class Singleton {
    private static Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();

        }
        return instance;
    }

    /*
    如果该兑现用于序列化，可以保证在序列化前后保持一致
    * */
    public Object readResolve(){
        return instance;
    }

}
