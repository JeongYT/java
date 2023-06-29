package test03;

public class Employee {
    public static int serialNum = 1000;
    // 멤버변수(인스턴스변수)
    private int employeeId;
    private String employeeName;
    private String department;
    // 사원이 추가될때마다 serialNum을 자동증가하게 하자.
    public Employee(){
        serialNum++;
        employeeId=serialNum;
        // employeeId = ++serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
//    public String showName(){
//        return getEmployeeName();
//    }
    public static int showName(){
        int name;
        name=serialNum;
        return name;
    }
    // static 메소드 내부에서는 일반함수는 참조할 수 없다.
    // static 메소드는 지역변수 사용가능하고, static 변수만 사용가능하다.
    // 인스턴스변수, 인스턴스메소드와 스태틱 메소드는 시작부터가 다르다.
    // 메모리에 로딩되는 시점이 다르다.
    // 인스턴스변수는 인스턴스생성이 되어야 사용가능하다.
    // static 변수나 메소드는 프로그램 시작될때 자동로딩된다.


    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmployeeName("이순신");
        System.out.println(emp1.serialNum); // 1000
        System.out.println(Employee.serialNum); // 1000
        Employee emp2 = new Employee();
        emp2.setEmployeeName("강감찬");
        Employee.serialNum++;
        System.out.println(emp2.serialNum);
        emp2.serialNum++;
        System.out.println(emp2.serialNum);
        System.out.println(emp1.serialNum);
        System.out.println(Employee.serialNum++);
        System.out.println(Employee.serialNum++);
        emp1.setEmployeeId(5000);
        System.out.println(emp1.getEmployeeId());
//        emp2.setEmployeeId();
        System.out.println(emp2.getEmployeeId()); // 0
        Employee emp3=new Employee();
        System.out.println(emp3.getEmployeeId());
        Employee emp4=new Employee();
        System.out.println(emp4.getEmployeeId());
        // static 변수는 ㅊ마조변수로 호출하지말고, 클래스명.변수명으로 호출한다.
        System.out.println(Employee.serialNum);
        Employee emp5=new Employee();
        System.out.println(emp5.getEmployeeId());
        Employee emp6=new Employee();
        System.out.println(emp6.getEmployeeId());
        System.out.println(Employee.showName());

    }
}
