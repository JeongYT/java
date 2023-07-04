package test05;

public class Dog extends Pet {
    String name;
    int weight;
    int getWeight(){
        return weight;
    }

    @Override
    public void move() {
        // super.move();
        System.out.println(name + "가 빨리 움직인다.");
    }
}
