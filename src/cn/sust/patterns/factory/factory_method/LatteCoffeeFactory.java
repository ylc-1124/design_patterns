package cn.sust.patterns.factory.factory_method;

/**
 * 拿铁咖啡工厂类
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
