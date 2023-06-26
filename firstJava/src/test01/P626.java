package test01;

public class P626 {
    public static void main(String[] args) {
        int num = 10;
        int bNum = 0B1010; // 2진수(앞에 0B)
        int oNum = 012; // 8진수(앞에 0)
        int xNum = 0XA; // 16진수(앞에 0X)


        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);

        int cNum=0b01000001;
        System.out.println(cNum); // 65
        System.out.println((char)cNum); // A

//        int num = 12345678900; // 오류
//        long lnum = 12345678900; //오류
        long lnumber = 12345678900L; // ok

        double dnum = 3.14;
        float fnum = 3.14F;

        System.out.println(dnum);
        System.out.println(fnum);

        double dnum2 = 1;
        // 부동소수점방식의 오류
        for(int i = 0; i<10000; i++) {
            dnum2 = dnum2 + 0.1;
        }
        System.out.println((int)dnum2);

        char ch1 = 'A';
        System.out.println(ch1); // A
        System.out.println((int)ch1); // 65
        char ch2 = 66;
        System.out.println(ch2); // B
        int ch3 = 67;
        System.out.println(ch3); // 67
        System.out.println((char)ch3); // C
        //char ch4 = -66;  음수는 대입 할 수 없음
        char ch5 = '한';
        char ch6 = '\uD55C';
        System.out.println(ch5); // 한
        System.out.println(ch6); // 한
        char ch7='\uAD00';
        System.out.println(ch7); // 관
        String ch8="A";
        System.out.println(ch8);

        boolean isMarried = true;
        System.out.println(isMarried);

        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        //str = 3;

        final int MAX_NUM = 100;
        final int MIN_NUM;
        MIN_NUM = 0;
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        //MAX_NUM = 1000;

        byte bNum1 = 10;
        int iNum = bNum1; // 자동형변환

        int iNum2 = 20;
        float fNum = iNum2;

        int iNum3 = 10;
        byte bNum4 = (byte)iNum3; // 강제형변환

        double dNum = 3.14;
        int iNum5 = (int)dNum;


    }
}
