package cn.sust.patterns.singleton.demo03;

/**
 * 懒汉式:调用时创建实例对象 1.方法上锁
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public static synchronized Singleton getInstance() { //加synchronized保证线程安全
        if (instance == null) {  //只有第一次调用时会创建实例对象
            instance = new Singleton();
        }
        return instance;
    }

}
