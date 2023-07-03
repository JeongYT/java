package test04;

public class Person {
    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffee starCoffee, int money){
        this.money -= money;
        String message = starCoffee.bewing(money);
        System.out.println(name + "님이 " + money + "으로 " + message);
    }

    public void buyBeanCoffee(BeanCoffee beanCoffee, int money){
        this.money -= money;
        String message = beanCoffee.bewing(money);
        System.out.println(name + "님이 " + money + "으로 " + message);
    }
}
