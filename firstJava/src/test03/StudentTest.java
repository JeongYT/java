package test03;

public class StudentTest {
    public static void main(String[] args) {
        Student 김우빈 = new Student(100,"김우빈");
        김우빈.setKoreaSubject("국어",90);
        김우빈.setMathSubject("수학",80);
        김우빈.showStudentScore();
    }
}