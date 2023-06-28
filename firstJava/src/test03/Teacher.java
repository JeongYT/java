package test03;

public class Teacher {
    String name;
    int money;

    public Teacher(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) { // 승차
        if(money < 1000) {
            System.out.println(name + "님이 돈이 부족하여 버스를 탈 수 없습니다.");
        } else {
            bus.takeBus(1000);
            this.money-=1000;
        }

    }

    public void takeSubway(Subway subway) {
        if(money < 1200) {
            System.out.println(name + "님이 돈이 부족하여 지하철을 탈 수 없습니다.");
        } else {
            subway.takeSubway(1200);
            this.money-=1200;
        }

    }

    public void showInfo() {
        System.out.print(name + "님의 남은 돈은 ");
        System.out.println(money + "원 입니다.");
    }
}
