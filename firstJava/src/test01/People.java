package test01;

public class People {
    // 멤버변수의 상태는 메소드에 의해 변경이 되어야 한다.
    private int 포만감=30;

    // 멤버함수
    public void eat() {
        포만감 += 10;
    }
    public String toString() {
        String 상태="";
        if(포만감<50){
            상태="배고프다";
            return 상태;
        }else{
            상태="배부르다";
            return 상태;
        }
    }

    public static void main(String[] args) {
        People 원빈 = new People();
        // 원빈.포만감=50; // 배부르다
        System.out.println(원빈.toString());
        원빈.eat();
        원빈.eat();
        원빈.eat();
        System.out.println(원빈.toString());
    }


}
