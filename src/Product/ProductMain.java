package product;

public class ProductMain {
    public static void main(String[] args) {
        Product[] product = new Product[3];

        product[0] = new Product("케이스", 20000);
        product[1] = new Electronics("마우스", 130000, 12);
        product[2] = new Electronics("키보드", 200000, 12);
        product[0].setName("곰돌이 케이스");

        System.out.println("=== 제품 목록 출력 ===");
        for (Product item : product) {
            item.printInfo();

            if (item instanceof Electronics) {
                ((Electronics) item).extendWarranty(6);
            }
            System.out.println("--------------------");
        }

        Product.showTotalProduction();
    }
}