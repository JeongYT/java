package test05;

public class PetTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.age=25;
        dog1.name="누렁이";
        dog1.weight=10;

        System.out.println("강아지 이름은 " + dog1.name + "이고 몸무게는 " + dog1.getWeight());
        dog1.move();

        Bird bird1 = new Bird();
        bird1.age = 10;
        bird1.type="앵무새";
        bird1.flightYN=true;
        String flight = bird1.getFlight() ? "날수있다." : "날수없다";
        System.out.println(bird1.type + " : " + flight);
        bird1.move();

    }
}
