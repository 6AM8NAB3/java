package Kiosk;

public class Dessert extends KioskSystem {
    public Dessert(int price,String name) {
        super(price,name);
    }

    @Override
    public void description() {
        System.out.println(getName()+" 디저트는 저희 카페의 메인 디저트 시리즈중 하나 입니다.");
    }

    public void order() {
        totalSales += getPrice();
        System.out.println("주문이 완료되었습니다");
    }
}
