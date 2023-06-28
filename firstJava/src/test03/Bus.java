package test03;
// 버스 - 버스번호, 승객수, 돈
// 100번 버스의 승객수는 몇명이고 수입은 얼마이다.
public class Bus {
    int busNumber;
    int money;
    int passengerCount;

    public Bus(int busNumber) {
        this.busNumber=busNumber;
    }
    public void takeBus(int money){
        this.money+=money;
        passengerCount++;
    }
    public void showBusInfo() {
        System.out.print(busNumber + "번 버스의 승객은 " + passengerCount);
        System.out.println("명 이고, 수입은 " + money + "원 입니다");
    }
}
