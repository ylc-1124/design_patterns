package cn.sust.patterns.singleton.demo02;


public class Test {
    public static void main(String[] args) {
       Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}
