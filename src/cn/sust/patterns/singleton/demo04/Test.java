package cn.sust.patterns.singleton.demo04;

import cn.sust.patterns.singleton.demo04.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton instance =Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}
