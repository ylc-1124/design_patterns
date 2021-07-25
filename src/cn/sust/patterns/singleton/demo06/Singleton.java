package cn.sust.patterns.singleton.demo06;

/**
 * 饿汉式： 枚举方式 (线程安全，并且只会装载一次，强烈推荐)
 */
public enum Singleton {
    INSTANCE;
}
