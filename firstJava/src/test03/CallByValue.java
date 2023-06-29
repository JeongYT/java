package test03;

// 매개변수 전달 방법
// 1. 값 자체를 넘겨주는 방법
// 2. 주소 또는 참조로 전달하는 방법
class myInt{
    int b;
}

public class CallByValue {
    public static void main(String[] args) {
        // 값으로 전달하기
        int a=10;
        func1(a);
        System.out.printf("값으로 전달하기 -> %d\n",a );

        // 주소(참조)로 전달하기
        myInt m = new myInt();
        m.b=100;
        func2(m);
        System.out.println("함수실행후의 참조값 : " + m.b); // 101
    } // main
    static void func2(myInt m){
        m.b+=1;
        System.out.println("전달받은 참조변수 값 : " + m.b); // 101
    }

    private static void func1(int a) {
        a+=1;
        System.out.println("전달받은 a -> " + a);
    }
}
