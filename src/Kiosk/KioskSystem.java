package Kiosk;

public class KioskSystem {
    private int price;
    private String name;
    public static int totalSales = 0;

    public KioskSystem(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        if (price<0)
            return;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void description() {
        System.out.println("매뉴의 기본 설명을 출력합니다");
    }

    public static void showTotalSales() {
        System.out.println("[현재까지 정산된 금액은 "+totalSales+" 원 입니다]");
    }
}
