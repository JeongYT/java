package test03;

import java.util.*;
// 컬렉션프레임워크의 일부, java.util 패키지
// ArrayList(클래스) -> List(인터페이스) -> Collection(프레임워크)
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("welcome");
        list.add("to my world");
        System.out.println(list);
        // ArrayList에 값 변경하기
        list.set(1,"Happy Day");
        System.out.println(list);
        list.add("내일은 공공컨텐츠입니다.");
        System.out.println(list);
        // 값 삭제하기
        list.remove(1);
        System.out.println(list);
        list.remove("welcome");
        System.out.println(list);
        list.add("welcome");
        list.add("to my world");
        System.out.println(list);
        list.remove("welcome");
        System.out.println(list);
        System.out.println("크기는 " + list.size());
        // 향상된 for문으로 출력하기

        for(Object str : list)
            System.out.println(str);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abcdefg");
        list2.add("zzzzzz");
        for(String str:list2)
            System.out.println(str);
        // 배열은 iterator()
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
