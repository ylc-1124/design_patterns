package cn.sust.patterns.factory.simpleFactory;

/**
 * 简单工厂类，用来生产咖啡，依赖于具体咖啡 耦合死了
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
      Coffee coffee = null;
        if ("AmericanCoffee".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("LatteCoffee".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，没有你点的咖啡");
        }
        return coffee;
    }
}
