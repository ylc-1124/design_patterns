package cn.sust.patterns.singleton.demo05;

import java.lang.reflect.Constructor;

/**
 * 用反射破坏单实例
 */
public class DestroySingleton {
    public static void main(String[] args) throws Exception {
        //获取Singleton的字节码对象
        Class clazz = Singleton.class;
        //获取他的无参构造方法
        Constructor constructor = clazz.getDeclaredConstructor();
        //打开暴力反射（其实就是关闭访问检查）
        constructor.setAccessible(true);
        //调用无参构造器创建实例对象
        Singleton s1 = (Singleton) constructor.newInstance();
        Singleton s2 = (Singleton) constructor.newInstance();
        System.out.println(s1==s2);
    }
}
