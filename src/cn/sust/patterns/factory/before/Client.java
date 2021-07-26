package cn.sust.patterns.factory.before;

public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        //调用orderCoffee方法获取具体咖啡对象
        Coffee coffee = coffeeStore.orderCoffee("AmericanCoffee");

        System.out.println(coffee.getName());
    }
}
