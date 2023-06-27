package test02;

public class PetTest {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.type="강아지";
        pet1.age=8;

        Pet pet2 = new Pet();
        pet2.type="고양이";
        pet2.age=13;

        pet1.move();
        pet2.move();
        pet1.getAge();
        pet2.getAge();
    }
}

class Pet {
    String type;
    int age;

    void move(){
        System.out.println(this.type + "가 움직입니다.");
    }

    int getAge(){
        System.out.println(this.type + "는 " + this.age + "개월입니다.");
        return this.age;
    }
}
