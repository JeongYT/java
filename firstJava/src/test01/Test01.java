package test01;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("welcome to my world");
        System.out.println(100);
        System.out.println(100 + 200);
        int x = 30;
        System.out.println(x);
        System.out.println(x + 20);
        x = 300;
        System.out.println(x);
        final int y = 500; // 상수선언
        System.out.println(y);
        // y=600;  에러발생
        System.out.println(y);
        // 정수
        int num = 30;
        long l = 30L; // 정수계열에서 가장 큰수
        short s = 100;
        byte b = 127; // 8비트

        double d = 3000.00;
        float f = 30.0f;
        System.out.println(num);
        System.out.println(l);

        boolean isMaried = true;
        isMaried = false;
        System.out.println(isMaried);

        char c = 'A'; // 거의 사용안함, 홋따옴표 ' '
        char cc = '한';

        System.out.printf("%c,%c\n", c, cc);

        String str = "welcome 여러글자";
        System.out.println(str);

        int 정수1 = (int) 30L; // casting 강제형변환
        long 롱2 = 30; // 작은값 -> 큰값으로 자동형변환

        double ddd = 30.00;
        float fff = 30.0f;

        // boolean - 1바이트
        // char - 2바이트
        // byte - 1바이트
        // short - 2바이트
        // int - 4바이트
        // long - 8바이트
        // float - 4바이트
        // double - 8바이트

        // C언어에서 나온 명령어
        System.out.printf("저는 %s입니다. 나s이는 %d이고, 키는 %.2fcm입니다.","이순신",20, 190.5f);
        System.out.printf("\n");
        String str2=String.format("저는 %s입니다. 나이는 %d이고, 키는 %.2fcm입니다.","이순신",20, 190.5f);
        System.out.println(str2);
    }
}
