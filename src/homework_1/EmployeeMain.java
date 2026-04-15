package homework_1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("김철수","카카오");
        Developer dev = new Developer("홍길동", "네이버","Java");

        emp.introduce();
        System.out.println("---");
        dev.introduce();
    }
}
