package Employee;

public class Developer extends Employee{
    private String language;

    public Developer(String name, String company, String language) {
        super(name, company);
        this.language = language;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("주 언어는 "+ language + "입니다.");
    }
}
