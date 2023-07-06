package test05;

public class ComputerTest {
    public static void main(String[] args) {
//        NoteBook note = new NoteBook();
        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();
        NoteBook myNote=new MyNoteBook();
        myNote.turnOff();
        Desktop computer2 = new Desktop();
        computer2.typing();
    }
}
// NoteBook은 추상클래스라서 인스턴스를 생성할 수 없다.
// 추상메서드는 구현부가 없고 선언만 있는 메소드
