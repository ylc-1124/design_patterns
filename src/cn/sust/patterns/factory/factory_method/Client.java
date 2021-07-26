package cn.sust.patterns.factory.factory_method;

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        //设置咖啡工厂
        store.setFactory(new AmericanCoffeeFactory());
        //点咖啡
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
