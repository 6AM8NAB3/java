package Product;

public class Product {
    private String name;
    private int price;

    private static int count = 0;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price<0)
            return;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("[제품: "+getName()+"] [가격: "+getPrice()+"]");
    }

    public static void showTotalProduction() {
        System.out.println("현재까지 생성된 총 제품 수: "+count);
    }
}
