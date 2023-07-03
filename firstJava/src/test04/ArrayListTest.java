package test04;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("반지의제왕","호킨스"));
        library.add(new Book("해리포터","돌튼"));
        library.add(new Book("강철중","설경구"));
        library.add(new Book("범죄도시","마동석"));
        library.add(new Book("베테랑","황정민"));
        for(int i=0; i<library.size(); i++){
            library.get(i).showBookInfo();
        }

        Vector<Book> library2 = new Vector<Book>();
        library2.add(new Book("태백산맥2","조정래"));
        library2.add(new Book("반지의제왕2","호킨스"));
        library2.add(new Book("해리포터2","돌튼"));
        library2.add(new Book("강철중2","설경구"));
        library2.add(new Book("범죄도시2","마동석"));
        library2.add(new Book("베테랑2","황정민"));
        for(int i=0; i<library2.size(); i++){
            library2.get(i).showBookInfo();
        }
    }
}
