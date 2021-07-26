package cn.sust.patterns.factory.simpleFactory;

/**
 * 顾客类
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("AmericanCoffee");
        System.out.println(coffee.getName());
    }
}
