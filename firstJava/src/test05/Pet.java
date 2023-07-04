package test05;

public class Pet {
    int age;
    String name;
    public void move() {
        System.out.println("애완동물이 움직입니다");
    }
}
// 상속받은 클래스는 private은 상속이 안된다.
// default도 상속이 안된다.