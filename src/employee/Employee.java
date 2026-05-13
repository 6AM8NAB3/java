package employee;

public class Employee {
    private String name;
    private String company;

    public Employee(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void introduce() {
        System.out.print("저는 "+getName()+"입니다. ");
        System.out.println(getCompany()+"에서 일합니다.");
    }
}
