package test04;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car 소나타 = factory.createCar();
        Car 그랜다이져 = factory.createCar();

        System.out.println(소나타.getCarNum());
        System.out.println(그랜다이져.getCarNum());
    }
}
