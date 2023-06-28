package test03;
// 지하철 - 지하철번호, 승객수, 돈
// 100번 지하철의 승객수는 몇명이고 수입은 얼마이다.
public class Subway {
        int lineNumber;
        int money;
        int passengerCount;

    public Subway(int lineNumber) {
        this.lineNumber=lineNumber;
    }
    public void takeSubway(int money){
        this.money+=money;
        passengerCount++;
    }
    public void showSubwayInfo() {
        System.out.print(lineNumber + "라인 지하철 승객은 " + passengerCount);
        System.out.println("명 이고, 수입은 " + money + "원 입니다");
    }
}
