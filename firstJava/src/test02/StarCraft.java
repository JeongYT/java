package test02;

import java.util.Timer;
import java.util.TimerTask;

public class StarCraft {
    public static void main(String[] args) throws InterruptedException {
        Terran marin = new Terran("마린");
        Terran medic = new Terran("메딕");
        marin.attack("저그");
        marin.attack("프로토스");
        medic.cure("마린");
        marin.defend("저그");
        SCV scv = new SCV();
        scv.run();
        Marin marin2 = new Marin();
        marin2.run();

        Timer 돈캐기 = new Timer();
        돈캐기.scheduleAtFixedRate(scv,1000,3000);

        Timer 정찰 = new Timer();
        정찰.scheduleAtFixedRate(marin2, 1000, 2000);

        Thread.sleep(5000);

        System.out.println("광물에 돈이 떨어짐...");
        돈캐기.cancel();

        System.out.println("정찰나간 유닛이 죽었습니다..");
        정찰.cancel();
    }
}
    class Terran{
        private String 유닛;
        private int 생명치=2;
        private int 레벨=1;
        public Terran(){    }

        public Terran(String 유닛) {
            this.유닛 = 유닛;
            System.out.println(유닛 + "이 생성되었다.");
        }
        public void attack(String 적유닛){
            System.out.println(유닛 + "이 " + 적유닛 + "를 공격한다");
            레벨+=1;
            if(레벨>=3){
                System.out.println(유닛 + "이 스팀백을 장착했습니다.");
            }
        }
        public void cure(String 아군유닛){
            생명치 += 1;
            System.out.println(유닛 + "이 " + 아군유닛 + "을 치유한다");
        }
        public void defend(String 적유닛) {
            System.out.println(유닛 + "이 " + 적유닛 + "한테 공격당했습니다.");
            생명치 -= 1;
            if (생명치 == 0) System.out.println(유닛 + "이 " + 적유닛 + "에 의해 죽었습니다.");
        }
    }

class SCV extends TimerTask {
    @Override
    public void run() {
        System.out.println("광물(돈)을 캐고 있습니다.");
    }
}

class Marin extends TimerTask {
    @Override
    public void run() {
        System.out.println("정찰을 나갑니다");
    }
}

