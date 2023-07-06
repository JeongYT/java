package test05;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전한다");
    }

    @Override
    public void stop() {
        System.out.println("멈춘다");
    }

    @Override
    public void fuel() {
        System.out.println("연료를 주입합니다.");
    }

    @Override
    public void washCar() {
        System.out.println("차를 씻는다");
    }
}
