package test05;
// 포유류는 새끼를 낳는다. 정의한다
interface Mammal{
    abstract  void bear(); // 새끼를 낳는다.
}
interface 파충류{
    abstract void bear(); // 알을 낳는다.
}
abstract class Fish { // 어류 - 추상클래스
    void swim(){
        System.out.println("물고기는 헤엄치며 움직인다.");
    }
}
// 추상클래스는 인스턴스로 생성할 수 없다. new Fish() xxx

class Whale extends Fish implements Mammal{
    @Override
    public void bear() {
        System.out.println("고래는 새끼를 낳습니다.");
    }

    @Override
    void swim() {
        System.out.println("고래가 헤엄칩니다.");
    }
}
class Snake implements 파충류 {
    @Override
    public void bear() {
        System.out.println("뱀은 알을 낳습니다.");
    }
}

public class FishTest {
    public static void main(String[] args) {
        Whale 고래 = new Whale();
        고래.swim();
        고래.bear();
        Snake 뱀 = new Snake();
        뱀.bear();
        // Fish 고래2 = new Whale();
        // Fish 뱀2 = new Snake();
    }
}
