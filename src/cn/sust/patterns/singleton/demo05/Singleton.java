package cn.sust.patterns.singleton.demo05;

/**
 * 懒汉式：静态内部类实现（推荐使用）
 */
public class Singleton {
    private static boolean flag = false;
    //私有化构造方法
    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个实例对象");
            }
            flag = true;
        }
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
