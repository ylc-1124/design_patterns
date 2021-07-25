package cn.sust.patterns.singleton.demo02;

/**
 * 饿汉式：静态代码块
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() { } //构造方法私有化

    static {  //在静态代码块中创建实例
        instance = new Singleton();
    }
    public static Singleton getInstance() {
        return instance;
    }
}
