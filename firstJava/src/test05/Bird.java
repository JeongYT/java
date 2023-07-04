package test05;

public class Bird extends Pet {
    String type;
    boolean flightYN; // 날수있다.
    boolean getFlight(){
        return flightYN;
    }

    @Override
    public void move() {
        String flight = flightYN ? type + "가 날아간다" : type + "가 빨리 걸어간다.";
        System.out.println(flight);
    }
}
