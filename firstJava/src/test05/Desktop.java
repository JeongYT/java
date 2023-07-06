package test05;

public class Desktop extends Computer {
    @Override
    void display(){
        System.out.println("Desktop display");
    }
    @Override
    void typing(){
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOn() {
        // super.turnOn();
        System.out.println("데스크탑 전원을 켭니다");
    }

    @Override
    public void turnOff() {
        // super.turnOff();
        System.out.println("데스크탑 전원을 끕니다");
    }
}
