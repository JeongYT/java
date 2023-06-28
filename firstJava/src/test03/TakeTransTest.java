package test03;

// 학생이 지하철 타는 과정
// 학생 - 이름,돈
// 버스타다(Bus bus) bus.take(), 돈이 차감
// 지하철타다(Subway subway) subway.take(), 돈이 차감
// 학생의 남은돈이 얼마다
// 버스 - 버스번호, 승객수, 돈
// 100번 버스의 승객수는 몇명이고 수입은 얼마이다.
public class TakeTransTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mike",5000);
        Teacher t2 = new Teacher("Brown",10000);
        Teacher t3 = new Teacher("Jack",15000);
        Teacher t4 = new Teacher("Jon",1000);
        Bus bus100 = new Bus(100);
        Bus bus200 = new Bus(200);
        Subway redLine = new Subway(1);
        Subway greenLine = new Subway(2);

        t1.takeBus(bus100);
        t1.takeSubway(greenLine);
        t2.takeSubway(redLine);
        t3.takeBus(bus100);
        t3.takeSubway(greenLine);
        t4.takeSubway(greenLine);
        t4.takeBus(bus200);

        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
        t4.showInfo();

        bus100.showBusInfo();
        redLine.showSubwayInfo();
        greenLine.showSubwayInfo();

    }

}
