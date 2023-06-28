package test03;

public class Person {
    String name;
    int age;
    public Person(){
        this("이름없음",1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name); // 문자열은 null
        System.out.println(p.age); // 숫자는 0
        Person p2 = new Person("Mike",20);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.getPerson());
    }
}
