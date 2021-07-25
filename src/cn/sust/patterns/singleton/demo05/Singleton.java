package cn.sust.patterns.singleton.demo05;

/**
 * 懒汉式：静态内部类实现（推荐使用）
 */
public class Singleton {
    //私有化构造方法
    private Singleton() {

    }
    //创建一个静态内部类：当外部类被加载时，静态内部类不会被加载
    private static class SingletonHolder {
        //在内部类声明并创建外部类的实例对象
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供外部访问的api
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
