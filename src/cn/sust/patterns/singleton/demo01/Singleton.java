package cn.sust.patterns.singleton.demo01;

/**
 * 单例设计模式：饿汉式 1.静态方法创建实例对象
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){} //私有构造方法
    public static Singleton getInstance() {
        return instance;
    }
}
