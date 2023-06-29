package test03;

import java.util.Calendar;
import java.util.Date;

public class School {
    private static School instance = new School();
    // 싱글톤을 사용하는 이유는 비용을 줄인다.
    // 메모리 사용을 절약하기 위해서

    private School(){
        System.out.println("학교 인스턴스가 생성되었습니다.");
    }
    // NullPointException 에러발생
    public static School getInstance(){
        if(instance==null){
            instance = new School();
        }
        return instance;
    }

    public static void main(String[] args) {
//        School 학교1 = new School();
        School 학교1 = School.getInstance();
        School 학교2 = School.getInstance();
        System.out.println(학교1 == 학교2);
        School 학교3 = new School();
        School 학교4 = new School();
        System.out.println(학교3 == 학교4);
        Calendar 달력 = Calendar.getInstance();
        // Calendar 달력2 = new Calendar();
        System.out.println(달력);
        System.out.println(달력.getTime());
        System.out.println(달력.getFirstDayOfWeek());
        Date date = new Date();
        System.out.println(date);

    }
}
