package test05;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void fuel();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void washCar(){   }
    // 확장의 여지를 주는 메소드 -> 훅(Hook)메소드 라고 한다.

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // final 템플릿 메소드
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        fuel();
        washCar();
    }

}
