package animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println(name + "멍멍 짖어요.");
    }

}
