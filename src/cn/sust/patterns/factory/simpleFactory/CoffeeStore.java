package cn.sust.patterns.factory.simpleFactory;

/**
 * 运用工厂类使得咖啡店和具体咖啡解耦
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        //创建工厂类
     //   SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        //咖啡店在加工好的咖啡上二次加工
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
