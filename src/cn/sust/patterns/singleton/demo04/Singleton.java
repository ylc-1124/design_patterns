package cn.sust.patterns.singleton.demo04;

/**
 * 懒汉式：双重检查锁 线程安全且速度快 是一种很好的单例设计模式
 */
public class Singleton {
    //volatile关键字修饰 保证指令有序
    private static volatile Singleton instance;
    private Singleton() { //私有化构造方法

    }

    public static Singleton getInstance() {
        //第一次检查不需要抢占锁，可以直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) { //上锁
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
