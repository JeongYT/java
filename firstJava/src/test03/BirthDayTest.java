package test03;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthdDay day = new BirthdDay();
        day.setYear(2023);
        day.setMonth(1);
        day.setDay(30);
        System.out.println(day.isValid());
        day.printDay();

        day.setYear(2023);
        day.setMonth(2);
        day.setDay(28);
        System.out.println(day.isValid());
        day.printDay();

    }
}
