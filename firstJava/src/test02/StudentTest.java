package test02;

public class StudentTest {
    public void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address="서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName="김유신";
        studentKim.address="경주";

        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }

    public class Student {
        public int studentID;
        public String studentName;
        public String address;

        public void showStudentInfo() {
            System.out.println(studentName + "," + address);
        }

        public String getStudentName() {
            return studentName;
        }
    }
}
