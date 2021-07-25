package cn.sust.patterns.singleton.demo06;

public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance==instance1);
    }
}
