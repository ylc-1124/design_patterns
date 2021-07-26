package cn.sust.patterns.factory.factory_method;

/**
 * 美式咖啡工厂类
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
