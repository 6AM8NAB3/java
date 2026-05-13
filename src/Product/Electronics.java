package product;

public class Electronics extends Product {
    private int warrantyMonth;
    public Electronics(String name, int price, int warrantyMonth){
        super(name,price);
        this.warrantyMonth = warrantyMonth;
    }


    public int getWarrantyMonth() {
        return warrantyMonth;
    }

    @Override
    public void printInfo() {
        System.out.println("[제품: "+getName()+"] [가격: "+getPrice()+"] [보증기간: "+getWarrantyMonth()+"]");
    }

    public void extendWarranty(int month) {
        this.warrantyMonth = this.warrantyMonth + month;
    }
}
