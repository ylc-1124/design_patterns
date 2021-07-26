package cn.sust.patterns.factory.before;

/**
 * 咖啡店类 和具体咖啡耦合死了
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("AmericanCoffee".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("LatteCoffee".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，没有你点的咖啡");
        }
        //加配料
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}
