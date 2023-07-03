package test04;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        for(int i=0; i<library.length; i++){
            System.out.println(library[i]);
        }
        library[0] = new Book("HTML1","김가나1");
        library[1] = new Book("HTML2","김가나2");
        library[2] = new Book("HTML3","김가나3");
        library[3] = new Book("HTML4","김가나4");
        library[4] = new Book("HTML5","김가나5");
        for(int i=0; i<library.length; i++){
            library[i].showBookInfo();
        }
        // 객체배열 복사하기(얕은복사, 깊은복사)


        Book[] copyLibrary = new Book[0];
        System.arraycopy(library,0,copyLibrary,0,5);
        System.out.println("== copy library ==");
        for(Book book:copyLibrary){
            book.showBookInfo();
        }
        library[0].setTitle("CSS");
        library[0].setAuthor("이세종");
        System.out.println("== library ==");
        for(Book book:library){
            book.showBookInfo();
        }
        System.out.println("== copy library == ");
        for(Book book : copyLibrary){
            book.showBookInfo();
        }
        // 깊은복사
        // 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();
        // 서로 다른 인스턴스의 메모리 요소를 가진다.
        for(int i=0; i<library.length; i++){
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }
        library[0].setTitle("해리포터");
        library[0].setAuthor("JK 롤링");
        library[1].setTitle("반지의제왕");
        library[1].setAuthor("안소니");
        System.out.println("== library ==");
        for(Book book:library){
            book.showBookInfo();
        }
        System.out.println("== copy library == ");
        for(Book book : copyLibrary){
            book.showBookInfo();
        }
    }
}
