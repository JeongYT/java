package test04;

import java.sql.SQLOutput;

public class CoffeeTest {
    public static void main(String[] args) {
        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        System.out.println(starCoffee.bewing(4000));
        System.out.println(starCoffee.bewing(4300));
        System.out.println(beanCoffee.bewing(4100));
        System.out.println(beanCoffee.bewing(4500));

        System.out.println(starCoffee.bewing(Menu.STARAMERICANO));
        System.out.println(beanCoffee.bewing(Menu.BEANLATTE));

        Person kim = new Person("kim",10000);
        Person lee = new Person("lee",20000);

        kim.buyStarCoffee(starCoffee,Menu.STARAMERICANO);
        lee.buyBeanCoffee(beanCoffee,Menu.BEANLATTE);
        System.out.println("kim 남은돈 : " + kim.money);
        kim.buyStarCoffee(starCoffee,Menu.STARAMERICANO);
        lee.buyBeanCoffee(beanCoffee,Menu.BEANLATTE);
        System.out.println("lee 남은돈 : " + lee.money);
        System.out.println("kim 남은돈 : " + kim.money);

    }
}
